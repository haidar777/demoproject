<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<spring:htmlEscape defaultHtmlEscape="true" />
		<div class="carousel__component">
			<div class="carousel__component--headline">${fn:escapeXml(title)}</div>
			<p class="text-center" style="color:white">Tersedia beragam jenis kasur INTHEBOX dengan kualitas premium.
				Pilih spring bed berkualitas dengan ukuran kasur sesuai kebutuhan.</p>
					<div class="carousel__component--carousel js-owl-carousel js-owl-default owl-carousel">
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}" var="productUrl"/>
							<div class="carousel__item">
								<div class="carousel__item--thumb">
									<product:productPrimaryImage product="${product}" format="product"/>
								</div>
								<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>
								<div><c:out escapeXml="false" value="${ycommerce:sanitizeHTML(product.description)}" /></div>
<%--									<product:productCarousel product="${product}" />--%>
								<div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>
<%--								<p class="card-text">This content is a little bit longer.</p>--%>
								<a class="btn btn-primary" role="button" href="${productUrl}">Beli Sekarang</a>
							</div>
						</c:forEach>
					</div>
		</div>


