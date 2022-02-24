<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<template:demoPage pageTitle="${pageTitle}">
    <section class="testimony section">
        <div class="container">
            <div class="section-header">
                <cms:pageSlot position="TestimoniHeader" var="feature" element="div" class="testimoniheader">
                    <cms:component component="${feature}" element="div" class=""/>
                </cms:pageSlot>
            </div>
            <div class="under-header">Banyak pembeli yang merasa puas dengan kualitas kasur INTHEBOX</div>
            <div class="desc-header">
                <cms:pageSlot position="TestimoniParagraph1" var="feature" element="div" class="testimoniparagraph1">
                    <cms:component component="${feature}" element="div" class=""/>
                </cms:pageSlot>
                <br>
                <cms:pageSlot position="TestimoniParagraph2" var="feature" element="div" class="testimoniparagraph2">
                    <cms:component component="${feature}" element="div" class=""/>
                </cms:pageSlot>
            </div>
            <cms:pageSlot position="TestimoniList" var="feature" element="div" class="">
                <cms:component component="${feature}" element="div" class=""/>
            </cms:pageSlot>
        </div>
    </section>
</template:demoPage>