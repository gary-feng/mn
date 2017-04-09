<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<div>
    Index page.
    <br>
    <c:forEach items="${actors}" var="actor">
        <c:out value="${actor.name}"></c:out>
    </c:forEach>
</div>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>