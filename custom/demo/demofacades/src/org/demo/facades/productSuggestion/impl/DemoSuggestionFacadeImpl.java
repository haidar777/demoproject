package org.demo.facades.productSuggestion.impl;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.variants.model.VariantProductModel;
import org.demo.core.productSuggestion.service.DemoSuggestionService;
import org.demo.facades.productSuggestion.DemoSuggestionFacade;
import org.springframework.beans.factory.annotation.Required;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DemoSuggestionFacadeImpl implements DemoSuggestionFacade {
    private UserService userService;
    private ProductService productService;
    private DemoSuggestionService demoSuggestionService;
    private Converter<ProductModel, ProductData> productConverter;


    @Override
    public List<ProductData> getReferencesForProducts(Set<String> productCodes, List<ProductReferenceTypeEnum> referenceTypes, boolean excludePurchased, Integer limit) {
        final UserModel user = getUserService().getCurrentUser();
        final Set<ProductModel> products = new HashSet<ProductModel>();
        for (final String productCode : productCodes)
        {
            final ProductModel product = getProductService().getProductForCode(productCode);
            products.addAll(getAllBaseProducts(product));
        }
        final List<ProductModel> suggestions = getDemoSuggestionService()
                .getReferencesForProducts(new LinkedList<ProductModel>(products), referenceTypes, user, excludePurchased, limit);

        return Converters.convertAll(suggestions, getProductConverter());
    }

    protected Set<ProductModel> getAllBaseProducts(final ProductModel productModel)
    {
        final Set<ProductModel> allBaseProducts = new HashSet<ProductModel>();

        ProductModel currentProduct = productModel;
        allBaseProducts.add(currentProduct);

        while (currentProduct instanceof VariantProductModel)
        {
            currentProduct = ((VariantProductModel) currentProduct).getBaseProduct();

            if (currentProduct != null)
            {
                allBaseProducts.add(currentProduct);
            }
        }
        return allBaseProducts;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    protected ProductService getProductService()
    {
        return productService;
    }

    @Required
    public void setProductService(final ProductService productService)
    {
        this.productService = productService;
    }

    public DemoSuggestionService getDemoSuggestionService() {
        return demoSuggestionService;
    }

    public void setDemoSuggestionService(DemoSuggestionService demoSuggestionService) {
        this.demoSuggestionService = demoSuggestionService;
    }

    public Converter<ProductModel, ProductData> getProductConverter() {
        return productConverter;
    }

    public void setProductConverter(Converter<ProductModel, ProductData> productConverter) {
        this.productConverter = productConverter;
    }
}
