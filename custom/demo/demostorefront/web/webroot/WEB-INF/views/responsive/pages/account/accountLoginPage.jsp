<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<style>
	body {
		background-image: url("/login-bgimage.png");
	}
</style>
<template:page pageTitle="${pageTitle}">
	<div class="row">
		<div class="col-md-6">
			<cms:pageSlot position="LoginContentSlot" var="feature" element="div" class="login-left-content-slot">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</div>
<%--		<div class="col-md-6">--%>
<%--			<cms:pageSlot position="RightContentSlot" var="feature" element="div" class="login-right-content-slot">--%>
<%--				<cms:component component="${feature}"  element="div" class="login-right-content-component"/>--%>
<%--			</cms:pageSlot>--%>
<%--		</div>--%>
	</div>
</template:page>