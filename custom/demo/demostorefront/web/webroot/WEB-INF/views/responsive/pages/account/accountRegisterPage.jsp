<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:logregPage pageTitle="${pageTitle}">
	<div class="container">
		<div class="loginregislogo">
			<cms:pageSlot position="RegisterLogo" var="feature" element="div">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</div>
		<cms:pageSlot position="RegisterContentSlot" var="feature" element="div" class="register-content-slot">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
</template:logregPage>