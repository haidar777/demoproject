package org.demo.core.product.dao;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.demo.core.model.DemoProductModel;

import javax.annotation.Resource;
import org.apache.commons.collections.CollectionUtils;
import java.util.List;

public class DemoProductDAOImpl implements DemoProductDAO{
    private static final String QUARY_DEMO_PRODUCT = "SELECT {pk} FROM {Product}";

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<Object> getAllProduct() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(QUARY_DEMO_PRODUCT);

        final SearchResult<Object> products = flexibleSearchService.search(flexibleSearchQuery);
        if(CollectionUtils.isNotEmpty(products.getResult())){
            return products.getResult();
        }else{
            return null;
        }
    }
}
