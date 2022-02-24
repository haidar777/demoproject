package org.demo.core.productSuggestion.service.impl;

import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.productSuggestion.dao.DemoProductSuggestionDao;
import org.demo.core.productSuggestion.service.DemoProductSuggestionService;
import org.demo.facades.product.data.DemoVariantProductData;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


public class DemoProductSuggestionServiceImpl implements DemoProductSuggestionService {
    @Resource(name="demoProductSuggestionDao")
    private DemoProductSuggestionDao demoProductSuggestionDao;

    @Override
    public DemoVariantProductData getDemoProductSuggestionById(String name) {
        DemoVariantProductModel productModel = demoProductSuggestionDao.getDemoProductSuggestionById(name);
        DemoVariantProductData productData = new DemoVariantProductData();
        if(productModel != null){
            productData.setId(productModel.getCode());
            productData.setName(productModel.getName());
            productData.setSize(productModel.getSize());
            productData.setDesc(productModel.getDesc());
            productData.setType(productModel.getType());
            productData.setDescription(productModel.getDescription());
            productData.setPicture(productModel.getPicture());
            return productData;
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductData> getDemoProductSuggestion() {
        DemoVariantProductModel productModel = (DemoVariantProductModel) demoProductSuggestionDao.getDemoProductSuggestion();
        DemoVariantProductData productData = new DemoVariantProductData();
        if(productModel != null){
            productData.setId(productModel.getCode());
            productData.setName(productModel.getName());
            productData.setSize(productModel.getSize());
            productData.setDesc(productModel.getDesc());
            productData.setType(productModel.getType());
            productData.setDescription(productModel.getDescription());
            productData.setPicture(productModel.getPicture());
            return (List<DemoVariantProductData>) productData;
        }else{
            return null;
        }
    }

    @Override
    public List<DemoVariantProductData> getDemoProductSuggestionByType(String type, String excludeCode) {
        List<DemoVariantProductModel> productModels = demoProductSuggestionDao.getDemoProductSuggestionByType(type, excludeCode);
        List<DemoVariantProductData> productData = new ArrayList<DemoVariantProductData>();

        if(productModels != null){
            for(DemoVariantProductModel productModel : productModels){
                DemoVariantProductData tempProductData = new DemoVariantProductData();
                tempProductData.setId(productModel.getCode());
                tempProductData.setName(productModel.getName());
                tempProductData.setSize(productModel.getSize());
                tempProductData.setDesc(productModel.getDesc());
                tempProductData.setType(productModel.getType());
                tempProductData.setDescription(productModel.getDescription());
                tempProductData.setPicture(productModel.getPicture());

                productData.add(tempProductData);
            }
            return productData;
        }else{
            return null;
        }
    }

}
