<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
    <%-- header --%>
    <tiles:insertAttribute name="header" />

    <%-- body --%>
    <div class="main">
        <tiles:insertAttribute name="body" />
    </div>

    <%-- footer --%>
    <tiles:insertAttribute name="footer" />

<script type="text/javascript" src="js/common.js"></script>
</body>
</html>