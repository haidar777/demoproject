<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="content-testimoni">
    <c:forEach items="${testimonyList}" var="testimonyList">
        <div class="testimoni">
            <div class="p1">
                <div class="t-name">
                    <c:out value = "${testimonyList.getName()}" />
                </div>
                <div class="t-profil">
                    <img src="${commonResourcePath}/images/review-avatar.png">
                </div>
            </div>
            <div class="p2">
                <c:forEach begin = "1" end = "${testimonyList.getRating()}">
                    <img src="${commonResourcePath}/images/star-full.png">
                </c:forEach>
            </div>
            <div class="p3">
                <div class="p31">
                    <c:out value = "${testimonyList.getText()}" />
                </div>
                <div class="p32">
                    <c:out value = "${testimonyList.getParagraph()}" />
                </div>
                <div class="p33">
                    <c:out value = "${testimonyList.getTime()}" />
                </div>
            </div>
        </div>
    </c:forEach>
</div>