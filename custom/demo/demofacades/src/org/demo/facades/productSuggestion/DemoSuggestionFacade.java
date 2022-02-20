package org.demo.facades.productSuggestion;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;
import java.util.Set;

public interface DemoSuggestionFacade {
    List<ProductData> getReferencesForProducts(Set<String> productCodes, List<ProductReferenceTypeEnum> referenceTypes,
                                               boolean excludePurchased, Integer limit);
}
