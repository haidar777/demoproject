package org.demo.core.productSuggestion.dao;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface DemoSimpleSuggestionDao extends Dao {
    List<ProductModel> findProductsRelatedToProducts(List<ProductModel> products, List<ProductReferenceTypeEnum> referenceTypes, UserModel user, boolean excludePurchased, Integer limit);
}
