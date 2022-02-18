package org.demo.facades.product.facade;


import org.demo.facades.product.data.ProductData;

import java.util.List;

public interface DemoProductFacade {
    ProductData getProductById(String name);
    List<ProductData> getProduct();
}
