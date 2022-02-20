<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>

<%----------------FROM SIMPLE SUGGESTION COMPONENT----------------%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<spring:htmlEscape defaultHtmlEscape="true" />


<template:demoPage pageTitle="${pageTitle}">
    <%-----MAIN PRODUCT DETAIL-----%>
	<product:productDetailsPanel />

	<div class="row item">
            <cms:pageSlot position="Keterangan" var="feature" element="div" class="keterangan">
                 <cms:component component="${feature}" element="div" class=""/>
            </cms:pageSlot>
    </div>
	<cms:pageSlot position="CrossSelling" var="comp" element="div" class="productDetailsPageSectionCrossSelling">
		<cms:component component="${comp}" element="div" class="productDetailsPageSectionCrossSelling-component"/>
	</cms:pageSlot>

    <%-----SUGGESTION PRODUCTS-----%>
    <div id="quickViewTitle" class="quickView-header display-none"><spring:theme code="popup.quick.view.select"/></div>

    <c:choose>
        <%-----REQUIREMENT MAXIMUM PRODUCTS: FIVE-----%>

    	<c:when test="${not empty suggestions and component.maximumNumberProducts > 0}">
    		<div class="carousel-component">
    			<div class="headline">${fn:escapeXml(component.title)}</div>
    			<div class="carousel js-owl-carousel js-owl-lazy-reference js-owl-carousel-reference">

    			    <%-----SHOWING PRODUCTS SUGGESTION-----%>
    				<c:forEach end="${component.maximumNumberProducts}" items="${suggestions}" var="suggestion">
    					<c:url value="${suggestion.url}/quickView" var="productQuickViewUrl"/>
    					<div class="item">
    						<a href="${fn:escapeXml(productQuickViewUrl)}" class="js-reference-item">

                                 <%-----SHOWING IMAGE SUGGESTION-----%>
                                <div class="thumb">
                                    <product:productPrimaryReferenceImage product="${suggestion}" format="product"/>
                                </div>

                                 <%-----SHOWING TITLE SUGGESTION-----%>
    							<c:if test="${component.displayProductTitles}">
    								<div class="item__name">${fn:escapeXml(suggestion.name)}</div>
    							</c:if>

                                <%-----SHOWING PRICE SUGGESTION-----%>
    							<c:if test="${component.displayProductPrices}">
    								<div class="item__price"><format:fromPrice priceData="${suggestion.price}"/></div>
    							</c:if>
    						</a>
    					</div>
    				</c:forEach>
    			</div>
    		</div>
    	</c:when>
    	<c:otherwise>
    		<component:emptyComponent/>
    	</c:otherwise>
    </c:choose>

</template:demoPage>