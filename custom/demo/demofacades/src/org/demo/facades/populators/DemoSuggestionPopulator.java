package org.demo.facades.populators;

import de.hybris.platform.cmsfacades.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


public class DemoSuggestionPopulator implements Populator<ProductModel, ProductData> {

    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        if(productModel.getCode() != null){
            productData.setCode(productModel.getCode());
        }
    }
}
