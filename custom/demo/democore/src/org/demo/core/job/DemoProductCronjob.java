package org.demo.core.job;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.commerceservices.setup.SetupSyncJobService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.util.Config;
import org.demo.core.model.DemoProductModel;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.product.dao.DemoProductDAO;

import javax.annotation.Resource;
import org.apache.log4j.Logger;

import java.util.List;

public class DemoProductCronjob extends AbstractJobPerformable<CronJobModel> {
    private static final String PRODUCT_CATALOG = Config.getString("productcatalogname", "demoProductCatalog");
    private static final Logger LOG = Logger.getLogger(DemoProductCronjob.class);
    @Resource
    ModelService modelService;

    @Resource
    DemoProductDAO demoProductDAO;

    @Resource
    private SetupSyncJobService setupSyncJobService;

    @Override
    public PerformResult perform(final CronJobModel cronJobModel) {

        List<ProductModel> products = demoProductDAO.getProduct();
        if(products != null){
            for(Object  product: products){
                if(product.getClass() == DemoProductModel.class){
                    DemoProductModel data = (DemoProductModel) product;

                    if(data.getApprovalStatus() == ArticleApprovalStatus.CHECK){
                        LOG.info(data.getName() + ": " + data.getApprovalStatus());

                        ((DemoProductModel) product).setApprovalStatus(ArticleApprovalStatus.APPROVED);
                        modelService.save(product);
                        LOG.info("Update Approval " + data.getName() + ": " + data.getApprovalStatus());
                        //setupSyncJobService.createProductCatalogSyncJob(PRODUCT_CATALOG);
                        PerformResult resultSync = setupSyncJobService.executeCatalogSyncJob(PRODUCT_CATALOG);
                        if(resultSync.getResult() == CronJobResult.SUCCESS){
                            LOG.info("Success Sync Product" + data.getName() + " to Online");
                        }else {
                            LOG.info("Something Wrong when Synv Product " + data.getName() + " to Online");
                        }
                    }
                }else{
                    DemoVariantProductModel data = (DemoVariantProductModel) product;
                    if(data.getApprovalStatus() == ArticleApprovalStatus.CHECK){
                        LOG.info(data.getName() + ": " + data.getApprovalStatus());
                        ((DemoVariantProductModel) product).setApprovalStatus(ArticleApprovalStatus.APPROVED);
                        modelService.save(product);
                        LOG.info("Update Approval " + data.getName() + ": " + data.getApprovalStatus());
                        //setupSyncJobService.createProductCatalogSyncJob(PRODUCT_CATALOG);
                        PerformResult resultSync = setupSyncJobService.executeCatalogSyncJob(PRODUCT_CATALOG);
                        if(resultSync.getResult() == CronJobResult.SUCCESS) {
                            LOG.info("Success Sync Product " + data.getName() + " to Online");
                        }else{
                            LOG.info("Something Wrong when Sync Product" + data.getName() + " to Online");
                        }

                    }
                }
            }
        }else{
            LOG.info("Data Product is empty");
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
