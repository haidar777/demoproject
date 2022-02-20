<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<template:demoPage pageTitle="${pageTitle}">
    <section class="about section mt-0">
        <div class="container px-0 image-header">
            <cms:pageSlot position="BannerAboutUs" var="feature" element="div" class="Banner">
                <cms:component component="${feature}" element="div" class=""/>
            </cms:pageSlot>
        </div>
        <div class="header">
            <div class="container">
                <div class="section-header">
                    <cms:pageSlot position="Tentang" var="feature" element="div" class="tentanginthebox">
                        <cms:component component="${feature}" element="div" class=""/>
                    </cms:pageSlot>
                </div>
            </div>
        </div>
        <div class="items">
            <div class="container">
                <div class="row item">
                    <cms:pageSlot position="ApaItuKasur" var="feature" element="div" class="apaitu">
                        <cms:component component="${feature}" element="div" class=""/>
                    </cms:pageSlot>
                </div>
                <div class="row item">
                    <cms:pageSlot position="Kenapa" var="feature" element="div" class="kenapaharus">
                        <cms:component component="${feature}" element="div" class=""/>
                    </cms:pageSlot>
                </div>
                <div class="row item">
                    <cms:pageSlot position="CaraBeli" var="feature" element="div" class="carabelikasur">
                        <cms:component component="${feature}" element="div" class=""/>
                    </cms:pageSlot>
                </div>
            </div>
        </div>
    </section>
    <section class="faq section">
        <div class="container">
            <cms:pageSlot position="Faq" var="feature" element="div" class="faq">
                <cms:component component="${feature}" element="div" class=""/>
            </cms:pageSlot>
        </div>
    </section>
</template:demoPage>