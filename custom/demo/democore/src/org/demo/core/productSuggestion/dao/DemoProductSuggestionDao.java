package org.demo.core.productSuggestion.dao;


import org.demo.core.model.DemoVariantProductModel;

import java.util.List;

public interface DemoProductSuggestionDao {
    DemoVariantProductModel getDemoProductSuggestionById(String name);
    List<DemoVariantProductModel> getDemoProductSuggestion();
    List<DemoVariantProductModel> getDemoProductSuggestionByType(String type, String excludeCode);
}
