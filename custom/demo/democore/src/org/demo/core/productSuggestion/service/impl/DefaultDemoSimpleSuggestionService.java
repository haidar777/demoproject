package org.demo.core.productSuggestion.service.impl;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.productSuggestion.dao.DemoSimpleSuggestionDao;

import java.util.Collections;
import java.util.List;

public class DefaultDemoSimpleSuggestionService implements org.demo.core.productSuggestion.service.DemoSimpleSuggestionService {
    private DemoSimpleSuggestionDao demoSimpleSuggestionDao;

    @Override
    public List<ProductModel> getReferencesForProducts(final List<ProductModel> products,
                                                       final List<ProductReferenceTypeEnum> referenceTypes, final UserModel user, final boolean excludePurchased,
                                                       final Integer limit)
    {
        if (CollectionUtils.isEmpty(products))
        {
            return Collections.emptyList();
        }
        return getDemoSimpleSuggestionDao().findProductsRelatedToProducts(products, referenceTypes, user, excludePurchased, limit);
    }

    protected DemoSimpleSuggestionDao getDemoSimpleSuggestionDao() {
        return demoSimpleSuggestionDao;
    }

    public void setDemoSimpleSuggestionDao(final DemoSimpleSuggestionDao demoSimpleSuggestionDao) {
        this.demoSimpleSuggestionDao = demoSimpleSuggestionDao;
    }


}
