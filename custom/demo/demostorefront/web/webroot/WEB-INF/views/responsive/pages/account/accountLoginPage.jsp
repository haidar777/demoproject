<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:logregPage pageTitle="${pageTitle}">
	<div class="container-login">
		<div class="loginregislogo">
			<cms:pageSlot position="LoginLogo" var="feature" element="div">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</div>
		<cms:pageSlot position="LoginContentSlot" var="feature" element="div" class="login-content-slot">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
</template:logregPage>