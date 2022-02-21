<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>


<template:demoPage pageTitle="${pageTitle}">
	<product:productDetailsPanel />
	<div class="row item">
            <cms:pageSlot position="Keterangan" var="feature" element="div" class="keterangan">
                 <cms:component component="${feature}" element="div" class=""/>
            </cms:pageSlot>
    </div>
	<cms:pageSlot position="CrossSelling" var="comp" element="div" class="productDetailsPageSectionCrossSelling">
		<cms:component component="${comp}" element="div" class="productDetailsPageSectionCrossSelling-component"/>
	</cms:pageSlot>

</template:demoPage>