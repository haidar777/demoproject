package org.demo.core.productSuggestion.dao.impl;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.productSuggestion.dao.DemoSimpleSuggestionDao;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultDemoSimpleSuggestionDao extends AbstractItemDao implements DemoSimpleSuggestionDao {
    private static final int DEFAULT_LIMIT = 5;
    private static final String REF_QUERY_PRODUCT_START = "SELECT DISTINCT {p.PK}, COUNT({p.PK}) AS NUM"
            + " FROM {Product AS p"
            + " LEFT JOIN ProductReference AS r ON {p.PK}={r.target} }"
            + " WHERE {r.source} IN (?products) AND {r.target} NOT IN (?products)";
    private static final String REF_QUERY_SUB = " AND NOT EXISTS ({{"
            + " SELECT 1 FROM {OrderEntry AS e2 LEFT JOIN Order AS o2 ON {e2.order}={o2.PK} } "
            + " WHERE {e2.product}={r.target} AND {o2.user}=?user }})";
    private static final String REF_QUERY_TYPES = " AND {r.referenceType} IN (?referenceTypes)";
    private static final String REF_QUERY_PARAM_TYPES = "referenceTypes";
    private static final String REF_QUERY_PRODUCT_GROUP = " GROUP BY {p.PK}";
    private static final String REF_QUERY_PRODUCT_ORDER = " ORDER BY NUM DESC";
    private static final String REF_QUERY_PARAM_USER = "user";
    private static final String REF_QUERY_PARAM_PRODUCTS = "products";

    @Override
    public List<ProductModel> findProductsRelatedToProducts(final List<ProductModel> products,
                                                            final List<ProductReferenceTypeEnum> referenceTypes, final UserModel user, final boolean excludePurchased,
                                                            final Integer limit)
    {
        Assert.notNull(products);
        Assert.notNull(user);

        final int maxResultCount = limit == null ? DEFAULT_LIMIT : limit.intValue();

        final Map<String, Object> params = new HashMap<String, Object>();
        final StringBuilder builder = new StringBuilder(REF_QUERY_PRODUCT_START);
        if (excludePurchased)
        {
            builder.append(REF_QUERY_SUB);
        }
        if (CollectionUtils.isNotEmpty(referenceTypes))
        {
            builder.append(REF_QUERY_TYPES);
            params.put(REF_QUERY_PARAM_TYPES, referenceTypes);
        }
        builder.append(REF_QUERY_PRODUCT_GROUP);
        builder.append(REF_QUERY_PRODUCT_ORDER);

        params.put(REF_QUERY_PARAM_USER, user);
        params.put(REF_QUERY_PARAM_PRODUCTS, products);

        final FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
        query.addQueryParameters(params);
        query.setNeedTotal(false);
        query.setCount(maxResultCount);

        final SearchResult<ProductModel> result = getFlexibleSearchService().search(query);
        return result.getResult();
    }

}
