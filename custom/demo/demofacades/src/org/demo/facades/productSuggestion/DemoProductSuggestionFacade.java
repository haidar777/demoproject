package org.demo.facades.productSuggestion;

import org.demo.facades.product.data.DemoVariantProductData;

import java.util.List;

public interface DemoProductSuggestionFacade {
    DemoVariantProductData getDemoProductSuggestionById(String name);
    List<DemoVariantProductData> getDemoProductSuggestion();
    List<DemoVariantProductData> getDemoProductSuggestionByType(String type, String excludeCode);

}
