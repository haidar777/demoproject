<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<c:choose>
	<c:when test="${not empty productData}">
		<div class="carousel__component">
			<div class="carousel__component--headline">${fn:escapeXml(title)}</div>
			<p class="text-center" style="color:white">Tersedia beragam jenis kasur INTHEBOX dengan kualitas premium.
				Pilih spring bed berkualitas dengan ukuran kasur sesuai kebutuhan.</p>
			<c:choose>
				<c:when test="${component.popup}">
					<div class="carousel__component--carousel js-owl-carousel js-owl-lazy-reference js-owl-carousel-reference">
						<div id="quickViewTitle" class="quickView-header display-none">
							<div class="headline">
								<span class="headline-text"><spring:theme code="popup.quick.view.select"/></span>
							</div>
						</div>
						<c:forEach items="${productData}" var="product">
							<c:url value="${product.url}/quickView" var="productQuickViewUrl"/>
<%--							<div class="carousel__item">--%>
<%--								<div class="card-deck">--%>
<%--									<div class="card">--%>
<%--										<div class="carousel__item--thumb">--%>
<%--											<product:productPrimaryReferenceImage product="${product}" format="product"/>--%>
<%--										</div>--%>
<%--										<div class="card-body">--%>
<%--											<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>--%>
<%--											<p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>--%>
<%--											<div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>--%>
<%--											<a href="${productQuickViewUrl}" class="js-reference-item">Beli Sekarang</a>--%>
<%--										</div>--%>
<%--									</div>--%>
<%--								</div>--%>
<%--&lt;%&ndash;								<a href="${productQuickViewUrl}" class="js-reference-item">&ndash;%&gt;--%>
<%--&lt;%&ndash;									<div class="carousel__item--thumb">&ndash;%&gt;--%>
<%--&lt;%&ndash;										<product:productPrimaryReferenceImage product="${product}" format="product"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;									</div>&ndash;%&gt;--%>
<%--&lt;%&ndash;									<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>&ndash;%&gt;--%>
<%--&lt;%&ndash;									<div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>&ndash;%&gt;--%>
<%--&lt;%&ndash;								</a>&ndash;%&gt;--%>
<%--							</div>--%>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<div class="carousel__component--carousel js-owl-carousel js-owl-default owl-carousel">
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}" var="productUrl"/>
<%--							<div class="carousel__item">--%>
<%--									<div class="card-deck">--%>
<%--										<div class="card">--%>
<%--											<div class="carousel__item--thumb">--%>
<%--												<product:productPrimaryImage product="${product}" format="product"/>--%>
<%--											</div>--%>
<%--											<div class="card-body">--%>
<%--												<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>--%>
<%--												<p class="card-text">This content is a little bit longer.</p>--%>
<%--												<div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>--%>
<%--												<a class="btn btn-primary" role="button" href="${productUrl}">Beli Sekarang</a>--%>
<%--											</div>--%>
<%--										</div>--%>
<%--									</div>--%>
<%--&lt;%&ndash;								</a>&ndash;%&gt;--%>
<%--							</div>--%>
							<div class="carousel__item">
								<div class="carousel__item--thumb">
										<product:productPrimaryImage product="${product}" format="product"/>
								</div>
								<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>
								<div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>
								<p class="card-text">This content is a little bit longer.</p>
								<a class="btn btn-primary" role="button" href="${productUrl}">Beli Sekarang</a>
							</div>
						</c:forEach>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</c:when>

	<c:otherwise>
		<component:emptyComponent/>
	</c:otherwise>
</c:choose>

