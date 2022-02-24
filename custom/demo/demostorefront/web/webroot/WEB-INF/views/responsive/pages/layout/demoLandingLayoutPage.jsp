<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<template:demoPage pageTitle="${pageTitle}">
    <div class="section">
        <cms:pageSlot position="Banner" var="feature">
            <cms:component component="${feature}"/>
        </cms:pageSlot>
        <cms:pageSlot position="ProductCarousel" var="feature" element="div">
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
        </div>

            <%--    <cms:pageSlot position="Testimony" var="feature" element="div">--%>
            <%--        <cms:component component="${feature}" element="div"/>--%>
            <%--    </cms:pageSlot>--%>
        <div class="testimony-section">
            <div class="container-title">
                <h3 class="testimony-title">TESTIMONI</h3>
                <div class="subtitle">
                    <div class="mb-2">
                        Banyak pembeli yang merasa puas dengan kualitas kasur INTHEBOX
                    </div>
                    Kami menerima beragam komentar positif dari pembeli di seluruh Indonesia, bahkan dari kalangan artis.
                    <br>
                    Bukan hanya pengalaman membeli kasur sping bed atau kasur busa,
                    <br>
                    banyak juga yang merasa puas dengan produk INTHEBOX lainnya yang terdiri dari bantal, guling, dan sofa bed.</div>
            </div>
            <div class="container">
                <div class="row flex-row-stretch">
                    <div class="col-sm-6 col-md-4 col-lg-3 flex-col">
                        <div class="card testimony-card">
                            <div class="card-header d-flex align-items-center">
                                <div class="name">Baim Wong</div>
                                <img class="account-icons" src="https://inthebox.net/images/review-avatar.webp">
                            </div>
                            <div class="card-body">
                                <div class="stars d-inline-flex">
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                </div>
                                <div class="content">
                                    <div class="kt-margin-b-10">
                                        <strong>Mantap banget</strong>
                                    </div>

                                    <p>Kasur baru yang packing nya simple banget, masuk ke dalam box! Kasur @inthebox.id dengan teknologi Pocket Springbed ini enak banget, nyaman dan empuk! Ada Free Bantal dan Free Ongkirnya juga lhoo! Mantap banget
                                    </p>
                                </div>
                                <div class="datetime">9 Sep 2020 - 6:22 pm</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-3 flex-col">
                        <div class="card testimony-card">
                            <div class="card-header d-flex align-items-center">
                                <div class="name">Raffi Ahmad</div>
                                <img class="account-icons" src="https://inthebox.net/images/review-avatar.webp">
                            </div>
                            <div class="card-body">
                                <div class="stars d-inline-flex">
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                </div>
                                <div class="content">
                                    <div class="kt-margin-b-10">
                                        <strong>Pilih kasur INTHEBOX aja!</strong>
                                    </div>

                                    <p>
                                        Pokoknya kalau mau beli spring bed yang bagus, materialnya berkualitas, nyaman, dan harganya murah, langsung pilih kasur INTHEBOX aja. Apalagi INTHEBOX+ ini nih bagus banget. Selama gue pakai kasur INTHEBOX di rumah itu bikin tidur jadi nyenyak, pas bangun langsung segar badannya.
                                    </p>
                                </div>
                                <div class="datetime">
                                    10 Aug 2020 - 11:41 pm
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-3 flex-col">
                        <div class="card testimony-card">
                            <div class="card-header d-flex align-items-center">
                                <div class="name">Baim Wong</div>
                                <img class="account-icons" src="https://inthebox.net/images/review-avatar.webp">
                            </div>
                            <div class="card-body">
                                <div class="stars d-inline-flex">
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                    <span><img class="stars" src="https://inthebox.net/images/star-full.png"></span>
                                </div>
                                <div class="content">
                                    <div class="kt-margin-b-10">
                                        <strong>Terima kasih Inthebox!</strong>
                                    </div>

                                    <p>
                                        Produk memuaskaan sekalii.. dan seru waktu unboxing ya :-D Nyaman sekalii. Pas dapet harga ﬂash sale lagi. Mantap banget sihh klo ini Semoga aweet ya. Trimakasih Inthebox. Trimakasih Tokopedia.
                                    </p>
                                </div>
                                <div class="datetime">
                                    8 Jun 2020 - 8:00 pm
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <a class="btn btn-primary alltes" href="https://localhost:9002/demostorefront/demostore/en/testimony">Lihat semua testimony</a>
        </div>
    </div>



</template:demoPage>