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
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<spring:htmlEscape defaultHtmlEscape="true" />
<spring:url value="/c/PRODUK" var="toAllProduct" htmlEscape="false"/>

<template:demoPage pageTitle="${pageTitle}">
    <%-----MAIN PRODUCT DETAIL-----%>
    <div class="detail-panel">
	    <product:productDetailsPanel/>
    </div>
    <%--
    <div class="row item">
       <cms:pageSlot position="Keterangan" var="feature" element="div" class="keterangan">
            <cms:component component="${feature}" element="div" class=""/>
       </cms:pageSlot>
    </div>
    <cms:pageSlot position="CrossSelling" var="comp" element="div" class="productDetailsPageSectionCrossSelling">
         <cms:component component="${comp}" element="div" class="productDetailsPageSectionCrossSelling-component"/>
    </cms:pageSlot>--%>

   <%-----SUGGESTION PRODUCTS-----%>
       <div class="headline">Other Products</div>
       <div class="container-suggestion">
           <div class="col-sm-12 col-md-10 col-lg-8">
               <c:forEach items="${checkProducts}" var="checkProduct">
                   <div class="item">
                        <div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
                                <div class="item-image">
                                     <a href="${checkProduct.getCode()}" class="item-title">
                                       <img src="${checkProduct.images.iterator().next().getUrl()}"/>
                                     </a>
                                </div>

                                <div class="content-suggestion">
                                    <c:if test="${not empty checkProduct.name}">
                                      <a href="${checkProduct.getCode()}" class="item-title"> ${checkProduct.getName()}<br/></a>
                                    </c:if>
                                    <c:if test="${not empty checkProduct.size}">
                                       <div class="item-size">${fn:escapeXml(checkProduct.size)}</div>
                                     </c:if>
                                     <div class="item-price">
                                       <format:fromPrice priceData="${checkProduct.price}"/>
                                     </div>

                                </div>
                       </div>
                       </a>
                   </div>
               </c:forEach>
           </div>
       </div>

    <div class="col-lg-12 btn-all">
        <button type="button" onclick="window.location.href = '/demostorefront/demostore/en/c/PRODUK';" class="btn btn-primary button-all-product">
            See All Product
        </button>
    </div>

    <div id="quickViewTitle" class="quickView-header display-none"><spring:theme code="popup.quick.view.select"/></div>
</template:demoPage>