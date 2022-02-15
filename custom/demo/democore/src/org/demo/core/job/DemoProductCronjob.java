package org.demo.core.job;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.demo.core.jalo.DemoProduct;
import org.demo.core.jalo.DemoVariantProduct;
import org.demo.core.model.DemoProductModel;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.product.dao.DemoProductDAO;

import javax.annotation.Resource;
import org.apache.log4j.Logger;

import java.util.List;

public class DemoProductCronjob extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(DemoProductCronjob.class);
    @Resource
    ModelService modelService;

    @Resource
    DemoProductDAO demoProductDAO;


    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("Demo Product Cronjob was trigger");

        List<Object> products = demoProductDAO.getAllProduct();
        if(products != null){
            for(Object  product: products){
                if(product.getClass() == DemoProductModel.class){
                    DemoProductModel data = (DemoProductModel) product;
                    LOG.info(data.getName() + ": " + data.getApprovalStatus());
                    if(data.getApprovalStatus() == ArticleApprovalStatus.CHECK){
                        ((DemoProductModel) product).setApprovalStatus(ArticleApprovalStatus.APPROVED);
                        modelService.save(product);
                    }
                }else{
                    DemoVariantProductModel data = (DemoVariantProductModel) product;
                    LOG.info(data.getCode() + ": " + data.getApprovalStatus());
                    if(data.getApprovalStatus() == ArticleApprovalStatus.CHECK){
                        ((DemoVariantProductModel) product).setApprovalStatus(ArticleApprovalStatus.APPROVED);
                        modelService.save(product);
                    }
                }
            }
        }else{
            LOG.info("Data Product is empty");
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
