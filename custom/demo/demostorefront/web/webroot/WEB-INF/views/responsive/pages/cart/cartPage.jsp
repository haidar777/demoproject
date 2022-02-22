<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="note" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>

<spring:htmlEscape defaultHtmlEscape="true" />
<c:url value="/cart/checkout" var="checkoutUrl" scope="session"/>
<c:url value="/quote/create" var="createQuoteUrl" scope="session"/>
<c:url value="${continueUrl}" var="continueShoppingUrl" scope="session"/>

<template:demoPage pageTitle="${pageTitle}">

	<cart:cartValidation/>
	<cart:cartPickupValidation/>

	<div class="cartpage-section-header">
        <h1>
            Shopping Cart
		<h1>
	</div>

    <div class="cartcomponent">
        <cms:pageSlot position="CartComponentContentSlot" var="feature">
            <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
        </cms:pageSlot>
    </div>

    <c:if test="${not empty cartData.rootGroups}">
        <note:demoNote/>

        <div class="total">
            <c:if test="${not empty cartData.rootGroups}">
                <ycommerce:testId code="cart_totalPrice_label">
                    <h1> TOTAL : <format:price priceData="${cartData.totalPrice}"/> </h1>
                </ycommerce:testId>
            </c:if>
        </div>
        <center>
            <div class="cartpagebutton">
                <button class="btn btn-default btn-block btn--continue-shopping js-continue-shopping-button" data-continue-shopping-url="${fn:escapeXml(continueShoppingUrl)}">
                    <spring:theme code="cart.page.continue"/>
                </button>
                <ycommerce:testId code="checkoutButton">
                    <button class="btn btn-primary btn-block btn--continue-checkout js-continue-checkout-button" data-checkout-url="${fn:escapeXml(checkoutUrl)}">
                        <spring:theme code="checkout.checkout"/>
                    </button>
                </ycommerce:testId>
            </div>
        </center>
    </c:if>
</template:demoPage>
