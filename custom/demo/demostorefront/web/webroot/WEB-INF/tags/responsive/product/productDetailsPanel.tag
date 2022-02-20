<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="row">
    <%-----Image Product-----%>
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}" />
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>

    <%-----Detail Product-----%>
    <div class="col-sm-6 col-lg-8">
		<div class="product-main-info">
			<div class="row">
			    <%-----Space between Image Product and Detail Product-----%>
				<div class="col-lg-6 space"></div>

				<%-----Title Product-----%>
				<div class="col-sm-12 col-md-8 col-lg-6">
				    <div class="product-details page-title">
                        <ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
                        		<div class="name">
                        		     ${fn:escapeXml(product.name)}
                        		</div>
                       </ycommerce:testId>
                    </div>

                    <%-----Price Product-----%>
				    <div class="product-details-price">
                    	<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
                    			<product:productPricePanel product="${product}" />
                        </ycommerce:testId>
                    </div>

                    <%-----Description Product-----%>
				    <div class="size">${ycommerce:sanitizeHTML(pageType)}</div>
				    <div class="description">${ycommerce:sanitizeHTML(product.description)}</div>
					<cms:pageSlot position="VariantSelector" var="component" element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div" class="yComponentWrapper page-details-variants-select-component"/>
					</cms:pageSlot>

					<%-----Add to Chart-----%>
					<cms:pageSlot position="AddToCart" var="component" element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div" class="yComponentWrapper page-details-add-to-cart-component"/>
					</cms:pageSlot>

					<%-----Product Suggestion-----%>

				</div>
			</div>
		</div>
	</div>

</div>