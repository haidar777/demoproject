package org.demo.core.product.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import javax.annotation.Resource;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.product.dao.DemoProductDAO;

import java.util.List;

public class DemoProductDAOImpl implements DemoProductDAO {
    private static final String QUERY_DEMO_PRODUCT = "SELECT {pk} FROM {product}";

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public ProductModel getProductById(String name){

        final FlexibleSearchQuery flexibleSearchForProductQuery = new FlexibleSearchQuery(QUERY_DEMO_PRODUCT);
        final SearchResult<ProductModel> products = flexibleSearchService.search(flexibleSearchForProductQuery);

        if(CollectionUtils.isNotEmpty(products.getResult())){
            return products.getResult().get(0);
        } else {
            return null;
        }
    }
    @Override
    public List<ProductModel> getProduct(){

        final FlexibleSearchQuery flexibleSearchForFindProductQuery = new FlexibleSearchQuery(QUERY_DEMO_PRODUCT);
        final SearchResult<ProductModel> products = flexibleSearchService.search(flexibleSearchForFindProductQuery);

        if(CollectionUtils.isNotEmpty(products.getResult())){
            return products.getResult();
        } else {
            return null;
        }
    }
}
