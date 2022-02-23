<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="hideHeaderLinks" required="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav" %>

<spring:htmlEscape defaultHtmlEscape="true"/>

<div class="demo-headers">
    <div class="demo-top-header">
        <div class="demo-top-header-paragraph">
            <div class="paragraph1">
                <cms:pageSlot position="TopLeftParagraph" var="component">
                    <c:if test="${component.uid=='TopHeaderLeftLogoComponent1'}">
                        <cms:component component="${component}"/>
                    </c:if>
                </cms:pageSlot>

                <cms:pageSlot position="TopLeftParagraph" var="component">
                    <c:if test="${component.uid=='TopHeaderLeftParagraphComponent1'}">
                        <cms:component component="${component}"/>
                    </c:if>
                </cms:pageSlot>
            </div>

            <div class="paragraph2">
                <cms:pageSlot position="TopLeftParagraph" var="component">
                    <c:if test="${component.uid=='TopHeaderLeftLogoComponent2'}">
                        <cms:component component="${component}"/>
                    </c:if>
                </cms:pageSlot>

                <cms:pageSlot position="TopLeftParagraph" var="component">
                    <c:if test="${component.uid=='TopHeaderLeftParagraphComponent2'}">
                        <cms:component component="${component}"/>
                    </c:if>
                </cms:pageSlot>
            </div>
        </div>

        <div class="demo-top-header-nav">
            <nav:demoTopHeaderNavigation/>
        </div>
    </div>
    <div class="demo-bottom-header">
        <div class="demo-bottom-header-content">
            <%--Website Logo--%>
            <div class="demo-web-logo">
                <cms:pageSlot position="HeaderLogo" var="logo" limit="1">
                    <cms:component component="${logo}" element="div" class="yComponentWrapper"/>
                </cms:pageSlot>
            </div>

            <%--Navbar--%>
            <div class="demo-bottom-header-nav">
                <nav:demoBottomHeaderNavigation/>
            </div>

            <%--Login--%>
            <div class="demo-bottom-header-login">
                <cms:pageSlot position="HeaderLinks" var="link">
                    <cms:component component="${link}" element="li" />
                </cms:pageSlot>

                <sec:authorize access="hasAnyRole('ROLE_ANONYMOUS')" >
                    <li class="liOffcanvas" style="list-style-type: none;">
                        <ycommerce:testId code="header_Login_link">
                            <c:url value="/login" var="loginUrl" />
                            <a href="${fn:escapeXml(loginUrl)}" id="log">
                                <spring:theme code="header.link.login" />
                            </a>
                        </ycommerce:testId>
                    </li>
                </sec:authorize>

                <div class="dropdown">
                    <a class="dropdown-toggle" id="dduser" data-toggle="dropdown" href="#"><spring:theme code="header.welcome" arguments="${user.firstName},${user.lastName}" /> <span class="caret"></span></a>
                    <ul style="list-style-type: none;" class="dropdown-menu">
                    <c:if test="${empty hideHeaderLinks}">
                        <c:if test="${uiExperienceOverride}">
                            <li class="backToMobileLink">
                                <c:url value="/_s/ui-experience?level=" var="backToMobileStoreUrl" />
                                <a href="${fn:escapeXml(backToMobileStoreUrl)}">
                                    <spring:theme code="text.backToMobileStore" />
                                </a>
                            </li>
                        </c:if>

            <%--            <sec:authorize access="!hasAnyRole('ROLE_ANONYMOUS')">--%>
            <%--                <c:set var="maxNumberChars" value="25" />--%>
            <%--                <c:if test="${fn:length(user.firstName) gt maxNumberChars}">--%>
            <%--                    <c:set target="${user}" property="firstName"--%>
            <%--                           value="${fn:substring(user.firstName, 0, maxNumberChars)}..." />--%>
            <%--                </c:if>--%>

            <%--                <li class="logged_in js-logged_in">--%>
            <%--                    <ycommerce:testId code="header_LoggedUser">--%>
            <%--                        <spring:theme code="header.welcome" arguments="${user.firstName},${user.lastName}" />--%>
            <%--                    </ycommerce:testId>--%>
            <%--                </li>--%>
            <%--            </sec:authorize>--%>


                        <sec:authorize access="!hasAnyRole('ROLE_ANONYMOUS')" >
                            <li class="liOffcanvas">
                                <ycommerce:testId code="header_signOut">
                                    <c:url value="/logout" var="logoutUrl"/>
                                    <a href="${fn:escapeXml(logoutUrl)}" style="color: #0c0c0c">
                                        <spring:theme code="header.link.logout" />
                                    </a>
                                </ycommerce:testId>
                            </li>
                        </sec:authorize>

                    </c:if>
                </ul>
                </div>

            </div>

            <%--Cart--%>
            <div class="demo-bottom-header-cart">
                <cms:pageSlot position="CartLink" var="component">
                    <c:if test="${component.visible}">
                        <cms:component component="${component}"/>
                    </c:if>
                </cms:pageSlot>
            </div>
        </div>
    </div>
</div>