package org.demo.facades.product.facade.impl;

import org.demo.core.product.service.DemoProductService;
import org.demo.facades.product.data.ProductData;
import org.demo.facades.product.facade.DemoProductFacade;

import javax.annotation.Resource;
import java.util.List;

public class DemoProductFacadeImpl implements DemoProductFacade {

    @Resource(name = "demoProductService")
    private DemoProductService demoProductService;

    @Override
    public ProductData getProductById(String name) {

        ProductData productData = demoProductService.getProductById(name);
        if (null != productData) {
            return productData;
        } else {
            return null;
        }
    }

    @Override
    public List<ProductData> getProduct() {

        ProductData productData = (ProductData) demoProductService.getProduct();
        if (null != productData) {
            return (List<ProductData>) productData;
        } else {
            return null;
        }
    }


}