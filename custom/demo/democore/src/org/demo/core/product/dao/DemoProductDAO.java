package org.demo.core.product.dao;

import de.hybris.platform.core.model.product.ProductModel;
import org.demo.core.model.DemoProductModel;
import org.demo.facades.product.data.ProductData;

import java.util.List;

public interface DemoProductDAO {
    ProductModel getProductById(String name);
    List<ProductModel> getProduct();
}
