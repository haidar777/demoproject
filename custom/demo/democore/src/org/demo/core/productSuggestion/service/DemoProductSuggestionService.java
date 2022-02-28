package org.demo.core.productSuggestion.service;


import org.demo.core.model.DemoVariantProductModel;

import java.util.List;

public interface DemoProductSuggestionService {
    DemoVariantProductModel getDemoProductSuggestionById(String name);
    List<DemoVariantProductModel> getDemoProductSuggestion();
    List<DemoVariantProductModel> getDemoProductSuggestionByType(String type, String excludeCode);
}
