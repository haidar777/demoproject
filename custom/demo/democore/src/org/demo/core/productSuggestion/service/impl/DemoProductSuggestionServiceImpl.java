package org.demo.core.productSuggestion.service.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.productSuggestion.dao.DemoProductSuggestionDao;
import org.demo.core.productSuggestion.service.DemoProductSuggestionService;
import org.demo.facades.product.data.DemoVariantProductData;

import javax.annotation.Resource;
import java.util.List;



public class DemoProductSuggestionServiceImpl implements DemoProductSuggestionService {
    @Resource(name="demoProductSuggestionDao")
    private DemoProductSuggestionDao demoProductSuggestionDao;

    //EDIT
    @Override
    public DemoVariantProductModel getDemoProductSuggestionById(String name){
        DemoVariantProductModel productModel = demoProductSuggestionDao.getDemoProductSuggestionById(name);
        if(productModel != null){
            return productModel;
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductModel> getDemoProductSuggestion(){
        List<DemoVariantProductModel> productModels = demoProductSuggestionDao.getDemoProductSuggestion();
        if(productModels != null){
            return productModels;
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductModel> getDemoProductSuggestionByType(String type, String excludeCode){
        List<DemoVariantProductModel> productModels = demoProductSuggestionDao.getDemoProductSuggestionByType(type,
                excludeCode);
        if(productModels != null){
            return productModels;
        }else{
            return null;
        }
    }
}
