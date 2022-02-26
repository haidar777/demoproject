package org.demo.facades.productSuggestion.impl;

import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.productSuggestion.service.DemoProductSuggestionService;
import org.demo.facades.product.data.DemoVariantProductData;
import org.demo.facades.productSuggestion.DemoProductSuggestionFacade;

import javax.annotation.Resource;
import java.util.List;
import de.hybris.platform.servicelayer.dto.converter.Converter;


public class DemoProductSuggestionFacadeImpl implements DemoProductSuggestionFacade {
    @Resource(name = "demoProductSuggestionService")
    private DemoProductSuggestionService demoProductSuggestionService;

    @Resource(name = "demoProductSuggestionConverter")
    private Converter<DemoVariantProductModel, DemoVariantProductData> productPopulator;

    @Override
    public DemoVariantProductData getDemoProductSuggestionById(String name) {
        DemoVariantProductData productData = demoProductSuggestionService.getDemoProductSuggestionById(name);
        if(productData != null){
            return productData;
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductData> getDemoProductSuggestion() {
        DemoVariantProductData productData= (DemoVariantProductData) demoProductSuggestionService.getDemoProductSuggestion();
        if(productData != null){
            return (List<DemoVariantProductData>) productData;
        }else{
            return null;
        }
    }

//    @Override
//    public List<DemoVariantProductData> getDemoProductSuggestionByType(String type, String excludeCode) {
//        List<DemoVariantProductData> productData = demoProductSuggestionService.getDemoProductSuggestionByType(type, excludeCode);
//        if(productData != null){
//            return productData;
//        }else{
//            return null;
//        }
//
//    }

    @Override
    public List<DemoVariantProductData> getDemoProductSuggestionByType(String type, String excludeCode) {
        List<DemoVariantProductData> productData = demoProductSuggestionService.getDemoProductSuggestionByType(type, excludeCode);
        if(productData != null){
            return productData;
        }else{
            return null;
        }
    }

}



