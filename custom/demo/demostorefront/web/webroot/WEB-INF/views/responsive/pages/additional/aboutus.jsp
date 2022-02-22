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
                        <cms:component component="${feature}" element="div" class="tentang"/>
                    </cms:pageSlot>
                </div>
                <div class="section-description">
                    INTHEBOX adalah merek kasur berkualitas dan perlengkapan tidur dengan material premium. Produk
                    <br>
                    lainnya terdiri dari bantal, guling dan sofa bed. Semua pilihan produk menggunakan material berkualitas.
                </div>
            </div>
        </div>
        <div class="items">
            <div class="container">
                <div class="row-reverse item">
                    <div class="col-md-7 order-1 order-md-2 image">
                        <cms:pageSlot position="ApaItuKasur" var="feature" element="div" class="apaitu">
                            <cms:component component="${feature}" element="div" class="apaitukasur"/>
                        </cms:pageSlot>
                    </div>
                    <div class="col-md-5 order-2 order-md-1 description mt-4 mt-md-0">
                        <div class="right-padding">
                            <div class="title"><h2>Apa itu Kasur INTHEBOX?</h2></div>
                            <div class="content">Kasur INTHEBOX adalah spring bed yang dikemas dalam box dan akan langsung mengembang sempurna
                                                ketika dibuka. Kini sudah banyak pilihan produk dengan harga yang terjangkau.
                                                Ketauhilah lebih lanjut agar kamu bisa memiliki tidur yang berkualitas.</div>
                            <div class="read-more"><a href="#" class="btn btn-brand reverse">Selengkapnya</a></div>
                        </div>
                    </div>
                </div>
                <div class="row item reverse" >
                    <div class="col-md-7 image">
                        <cms:pageSlot position="Kenapa" var="feature" element="div" class="kenapaharus">
                            <cms:component component="${feature}" element="div" class="kenapa"/>
                        </cms:pageSlot>
                    </div>
                    <div class="col-md-5 description mt-4 mt-md-0">
                        <div class="left-padding">
                            <div class="title"><h2>Kenapa Harus Pilih INTHEBOX?</h2></div>
                            <div class="content">Ada Banyak kelebihan kasur INTHEBOX khususnya bisa meningkatkan kualitas tidur dan istirahat kamu.
                                                Semua produk INTHEBOX dibuat dengan material premium, teknologi modern, dan desain yang elegan.
                                                Bisa dapat bantal gratis, free ongkir, dan garansi 10 Tahun.</div>
                            <div class="read-more"><a href="#" class="btn btn-brand reverse">Selengkapnya</a></div>
                        </div>
                    </div>
                </div>
                <div class="row-reverse item">
                    <div class="col-md-7 order-1 order-md-2 image">
                        <cms:pageSlot position="CaraBeli" var="feature" element="div" class="carabeli">
                            <cms:component component="${feature}" element="div" class="carabelikasur"/>
                        </cms:pageSlot>
                    </div>
                    <div class="col-md-5 order-2 order-md-1 description mt-4 mt-md-0">
                        <div class="right-padding">
                            <div class="title"><h2>Cara Beli Kasur INTHEBOX</h2></div>
                            <div class="content">Kasur INTHEBOX adalah spring bed yang dikemas dalam box dan akan langsung mengembang sempurna
                                                 ketika dibuka. Kini sudah banyak pilihan produk dengan harga yang terjangkau.
                                                 Ketauhilah lebih lanjut agar kamu bisa memiliki tidur yang berkualitas.</div>
                            <div class="read-more"><a href="#" class="btn btn-brand reverse">Selengkapnya</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <%-- FAQ Section --%>
    <section class="faq section">
        <div class="container">
            <div class="section-header">
                <cms:pageSlot position="Faq" var="feature" element="div" class="faqheader">
                    <cms:component component="${feature}" element="div" class="faq"/>
                </cms:pageSlot>
            </div>
            <div class="content-row">

            </div>
        </div>
    </section>
</template:demoPage>