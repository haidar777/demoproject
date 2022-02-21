<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<template:demoPage pageTitle="${pageTitle}">
    <cms:pageSlot position="Banner" var="feature">
        <cms:component component="${feature}"/>
    </cms:pageSlot>
    <cms:pageSlot position="ProductCarousel" var="feature" element="div" class="row no-margin">
        <cms:component component="${feature}"/>
    </cms:pageSlot>
    <div class="container-fluid unboxing">
        <h2 class="section-header">UNBOXING INTHEBOX</h2>
        <div class="carousel__component--carousel js-owl-carousel js-owl-lazy-reference owl-carousel owl-grab">
            <div class="carousel__item" style="width: 270px;">
                <cms:pageSlot position="UnboxingInTheBox1" var="feature" element="div">
                    <cms:component component="${feature}"/>
                </cms:pageSlot>
                <div class="title">Keluarkan</div>
                <div class="item__desc">Keluarkan kasur INTHEBOX dari kemasannya secara perlahan-lahan</div>
            </div>
            <div class="carousel__item" style="width: 270px;">
                <cms:pageSlot position="UnboxingInTheBox2" var="feature" element="div">
                    <cms:component component="${feature}"/>
                </cms:pageSlot>
                <div class="title">Posisikan</div>
                <div class="item__desc">Keluarkan kasur INTHEBOX dari kemasannya secara perlahan-lahan</div>
            </div>
            <div class="carousel__item" style="width: 270px;">
                <cms:pageSlot position="UnboxingInTheBox3" var="feature" element="div">
                    <cms:component component="${feature}"/>
                </cms:pageSlot>
                <div class="title">Buka Plastik</div>
                <div class="item__desc">Lepaskan plastik pembungkus dan pastikan logo INTHEBOX ada di bawah</div>
            </div>
            <div class="carousel__item" style="width: 270px;">
                <cms:pageSlot position="UnboxingInTheBox4" var="feature" element="div" >
                    <cms:component component="${feature}"/>
                </cms:pageSlot>
                <div class="title">Tunggu Mengembang</div>
                <div class="item__desc">Kasur INTHEBOX akan langsung mengembang. Tunggu 60 menit untuk digunakan.</div>
            </div>
        </div>
            <%--            <div class="item"><img src="assets/owl2.jpg" alt="Owl Image"></div>--%>
            <%--            <div class="item"><img src="assets/owl3.jpg" alt="Owl Image"></div>--%>
            <%--            <cms:pageSlot position="UnboxingInTheBox" var="feature" element="div" class="row no-margin">--%>
            <%--                <cms:component component="${feature}" element="div" class="col-xs-3 no-space yComponentWrapper"/>--%>

            <%--            </cms:pageSlot>--%>

    </div>

    <%--    <div class="row no-margin">--%>
    <%--        <div class="col-xs-12 col-md-6 no-space">--%>
    <%--            <cms:pageSlot position="Section2A" var="feature" element="div" class="row no-margin">--%>
    <%--                <cms:component component="${feature}" element="div"--%>
    <%--                               class="col-xs-12 col-sm-6 no-space yComponentWrapper"/>--%>
    <%--            </cms:pageSlot>--%>
    <%--        </div>--%>
    <%--        <div class="col-xs-12 col-md-6 no-space">--%>
    <%--            <cms:pageSlot position="ProductCarousel" var="feature" element="div" class="row no-margin">--%>
    <%--                <cms:component component="${feature}" element="div"--%>
    <%--                               class="col-xs-12 col-sm-6 no-space yComponentWrapper"/>--%>
    <%--            </cms:pageSlot>--%>
    <%--        </div>--%>
    <%--&lt;%&ndash;        <div class="col-xs-12">&ndash;%&gt;--%>
    <%--&lt;%&ndash;            <cms:pageSlot position="UnboxingInTheBox" var="feature" element="div" class="landingLayout2PageSection2C">&ndash;%&gt;--%>
    <%--&lt;%&ndash;                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>&ndash;%&gt;--%>
    <%--&lt;%&ndash;            </cms:pageSlot>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        </div>&ndash;%&gt;--%>
    <%--    </div>--%>

</template:demoPage>