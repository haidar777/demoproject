package org.demo.facades.productSuggestion.impl;

import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.productSuggestion.service.DemoProductSuggestionService;
import org.demo.facades.product.data.DemoVariantProductData;
import org.demo.facades.productSuggestion.DemoProductSuggestionFacade;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import de.hybris.platform.servicelayer.dto.converter.Converter;


public class DemoProductSuggestionFacadeImpl implements DemoProductSuggestionFacade {
    @Resource(name = "demoProductSuggestionService")
    private DemoProductSuggestionService demoProductSuggestionService;

    @Resource(name = "demoProductSuggestionConverter")
    private Converter<DemoVariantProductModel, DemoVariantProductData> productConverter;

    @Override
    public DemoVariantProductData getDemoProductSuggestionById(String name) {
        DemoVariantProductModel productModel = demoProductSuggestionService.getDemoProductSuggestionById(name);
        DemoVariantProductData productData = new DemoVariantProductData();
        if(productModel != null){
            productData = productConverter.convert(productModel, productData);
            return productData;
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductData> getDemoProductSuggestion() {
        List<DemoVariantProductModel> productModels = demoProductSuggestionService.getDemoProductSuggestion();
        List<DemoVariantProductData> productData = new ArrayList<DemoVariantProductData>();
        if(productModels != null){
            for(DemoVariantProductModel productModel : productModels){
                DemoVariantProductData tempProductData = new DemoVariantProductData();
                tempProductData = productConverter.convert(productModel, tempProductData);
                productData.add(tempProductData);
            }
            return productData;
        }else{
            return null;
        }
    }


    @Override
    public List<DemoVariantProductData> getDemoProductSuggestionByType(String type, String excludeCode) {
        List<DemoVariantProductModel> productModels = demoProductSuggestionService.getDemoProductSuggestionByType(type,
                excludeCode);
        List<DemoVariantProductData> productData = new ArrayList<DemoVariantProductData>();
        if(productModels != null){
            for(DemoVariantProductModel productModel: productModels){
                DemoVariantProductData tempProductData = new DemoVariantProductData();
                tempProductData = productConverter.convert(productModel, tempProductData);
                productData.add(tempProductData);
            }
            return productData;
        }else{
            return null;
        }
    }

}



