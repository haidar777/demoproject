package org.demo.core.productSuggestion.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.productSuggestion.dao.DemoProductSuggestionDao;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoProductSuggestionDaoImpl implements DemoProductSuggestionDao {
    private static final String QUERY_PRODUCT_SUGGESTION = "SELECT {pk} FROM {DemoVariantProduct} WHERE {code} = ?name";
    private static final String QUERY_PRODUCT_EXCLUDE_CODE = "SELECT {pk} FROM {DemoVariantProduct} WHERE {type} = ?type AND {code} NOT LIKE ?excludeCode";

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public DemoVariantProductModel getDemoProductSuggestionById(String name) {
       final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(QUERY_PRODUCT_SUGGESTION);
       flexibleSearchQuery.addQueryParameter("name", name);
       final SearchResult<DemoVariantProductModel> products = flexibleSearchService.search(flexibleSearchQuery);

       if(CollectionUtils.isNotEmpty(products.getResult())){
           return products.getResult().get(0);
       }else{
           return null;
       }
    }

    @Override
    public List<DemoVariantProductModel> getDemoProductSuggestion() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(QUERY_PRODUCT_SUGGESTION);
        final SearchResult<DemoVariantProductModel> products = flexibleSearchService.search(flexibleSearchQuery);

        if(CollectionUtils.isNotEmpty(products.getResult())){
            return products.getResult();
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductModel> getDemoProductSuggestionByType(String type, String excludeCode) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(QUERY_PRODUCT_EXCLUDE_CODE);
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put("type", type);
        params.put("excludeCode", excludeCode);
        flexibleSearchQuery.addQueryParameters(params);
        final SearchResult<DemoVariantProductModel> result = flexibleSearchService.search(flexibleSearchQuery);

        if(CollectionUtils.isNotEmpty(result.getResult())){
            return result.getResult();
        }else{
            return null;
        }
    }

}
