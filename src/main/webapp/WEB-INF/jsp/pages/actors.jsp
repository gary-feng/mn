<%@ include file="/WEB-INF/jsp/common/includes.jsp"%>
<div class="current-path">
    Actors page.
    <br>
    <c:forEach items="${actors}" var="actor">
        <c:out value="${actor.name}"></c:out>
    </c:forEach>
</div>