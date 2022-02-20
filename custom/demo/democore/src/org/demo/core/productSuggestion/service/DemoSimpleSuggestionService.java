package org.demo.core.productSuggestion.service;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;

import java.util.List;

public interface DemoSimpleSuggestionService {
    List<ProductModel> getReferencesForProducts(final List<ProductModel> products, List<ProductReferenceTypeEnum> referenceTypes,
                                                UserModel user, boolean excludePurchased, Integer limit);
}
