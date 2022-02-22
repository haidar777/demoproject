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

<template:demoPage pageTitle="${pageTitle}">

	<cart:cartValidation/>
	<cart:cartPickupValidation/>

	<div class="cartpage-section-header">
        <h1>
            Shopping Cart
		<h1>
	</div>

    <div>
        <cms:pageSlot position="TopContent" var="feature">
            <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
        </cms:pageSlot>
    </div>
<%--	<div>
	   <c:if test="${not empty cartData.rootGroups}">
           <cms:pageSlot position="CenterLeftContentSlot" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
           </cms:pageSlot>
        </c:if>
		
		 <c:if test="${not empty cartData.rootGroups}">
            <cms:pageSlot position="CartTotalsContentSlot" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
            </cms:pageSlot>
		</c:if>
				
		<c:if test="${empty cartData.rootGroups}">
            <cms:pageSlot position="EmptyCartContentSlot" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper content__empty"/>
            </cms:pageSlot>
		</c:if>
	</div> --%>

    <note:demoNote/><br>

    <div class="total">
        <c:if test="${not empty cartData.rootGroups}">
            <ycommerce:testId code="cart_totalPrice_label">
                <h1> TOTAL : <format:price priceData="${cartData.totalPrice}"/> </h1>
            </ycommerce:testId>
	    </c:if>
	</div> <br>

    <center>
        <div class="cartpagebutton">
            <a href="demostorefront/demostore/en/c/PRODUK">
            <button id="back" class="continueshopping" data-callback="onSubmit">
                Continue Shopping
            </button>
            </a>
            <button id="submit" class="checkout" data-callback="onSubmit">
                Complete Order
            </button>
        </div>
    </center> <br><br>

</template:demoPage>
