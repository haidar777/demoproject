package org.demo.core.productSuggestion.service;


import org.demo.facades.product.data.DemoVariantProductData;

import java.util.List;

public interface DemoProductSuggestionService {
    DemoVariantProductData getDemoProductSuggestionById(String name);
    List<DemoVariantProductData> getDemoProductSuggestion();
    List<DemoVariantProductData> getDemoProductSuggestionByType(String type, String excludeCode);

}
