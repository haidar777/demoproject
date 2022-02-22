package org.demo.facades.productSuggestion.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.facades.product.data.DemoVariantProductData;

public class DemoProductSuggestionPopulator implements Populator<DemoVariantProductModel, DemoVariantProductData>{

    @Override
    public void populate(DemoVariantProductModel productModel,  DemoVariantProductData productData) throws ConversionException {
        if(productModel.getCode() != null){
            productData.setId(productModel.getCode());
        }
        if(productModel.getName() != null){
            productData.setName(productModel.getName());
        }
        if(productModel.getSize() != null){
            productData.setSize(productModel.getSize());
        }
        if(productModel.getDesc() != null){
            productData.setDesc(productModel.getDesc());
        }
        if(productModel.getDescription() != null){
            productData.setDescription(productModel.getDescription());
        }
        if(productModel.getPicture() != null){
            productData.setPicture(productModel.getPicture());
        }
    }
}
