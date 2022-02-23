package org.demo.core.product.service.impl;

import de.hybris.platform.core.model.product.ProductModel;
import org.demo.core.product.dao.DemoProductDAO;
import org.demo.core.product.service.DemoProductService;
import org.demo.facades.product.data.ProductData;


import javax.annotation.Resource;
import java.util.List;

public class DemoProductServiceImpl implements DemoProductService {
    @Resource(name="demoProductDAO")
    private DemoProductDAO demoProductDao;

    @Override
    public ProductData getProductById(String name){

        ProductModel productModel = demoProductDao.getProductById(name);
        ProductData productData = new ProductData();

        if(null != productData){
            productData.setName(productModel.getName());
            productData.setId(productModel.getCode());
            return productData;
        } else {
            return null;
        }
    }
    @Override
    public List<ProductData> getProduct(){
        ProductModel productModel = (ProductModel) demoProductDao.getProduct();
        ProductData productData = new ProductData();

        if(null != productModel){
            productData.setName(productModel.getName());
            productData.setId(productModel.getCode());
            return (List<ProductData>) productData;
        } else {
            return null;
        }
    }


}
