package org.demo.core.productSuggestion.service.impl;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.productSuggestion.dao.DemoSuggestionDao;
import org.demo.core.productSuggestion.service.DemoSuggestionService;

import java.util.Collections;
import java.util.List;

public class DemoSuggestionServiceImpl implements DemoSuggestionService {
    private DemoSuggestionDao demoSuggestionDao;

    @Override
    public List<ProductModel> getReferencesForProducts(List<ProductModel> products, List<ProductReferenceTypeEnum> referenceTypes, UserModel user, boolean excludePurchased, Integer limit) {
        if (CollectionUtils.isEmpty(products))
        {
            return Collections.emptyList();
        }
        return getDemoSuggestionDao().findProductsRelatedToProducts(products, referenceTypes, user, excludePurchased, limit);
    }

    public DemoSuggestionDao getDemoSuggestionDao() {
        return demoSuggestionDao;
    }

    public void setDemoSuggestionDao(DemoSuggestionDao demoSuggestionDao) {
        this.demoSuggestionDao = demoSuggestionDao;
    }


}
