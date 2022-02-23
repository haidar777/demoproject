<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:logregPage pageTitle="${pageTitle}">
	<div class="container">
		<cms:pageSlot position="RegisterContentSlot" var="feature" element="div" class="register-content-slot">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
</template:logregPage>