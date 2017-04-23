<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
    <%-- variables --%>
    <c:set var="pageName">
        <tiles:getAsString name="pageName" />
    </c:set>

    <%-- header --%>
    <tiles:insertAttribute name="header" />

    <%-- body --%>
    <div class="main">
        <div class="main-content <tiles:getAsString name="pageName" />">
            <c:if test="${pageName == 'home'}">
                <div class="sub-nav">
                    <a href="#" class="current">最新</a>
                    <a href="#">最热</a>
                    <a href="#">推荐</a>
                    <a href="#">专题</a>
                </div>
            </c:if>
            <c:if test="${pageName != 'home'}">
                <div class="current-path">

                </div>
            </c:if>
            <tiles:insertAttribute name="body" />
        </div>
        <div class="side-bar">
            <div class="widget-top fa fa-mobile">
                <span>Mzitu.com</span>
                手机访问更精彩！
            </div>
            <div class="widget-middle">
                <h3>排行榜</h3>
                <a href="#">
                    <img src="image/demo.jpg">
                </a>
                <a href="#">
                    <img src="image/demo.jpg">
                </a>
                <a href="#">
                    <img src="image/demo.jpg">
                </a>
                <a href="#">
                    <img src="image/demo.jpg">
                </a>
            </div>
            <div class="widget-fix">
                <div class="ad-fix-middle-right"></div>
                <dl class="widget-favorite">
                    <dt>
                        <span class="selected">猜你喜欢</span>
                        <span>网友最爱</span>
                    </dt>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                    <dd>
                        <a href="#" target="_blank">比基尼辣妹海边写真</a>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="clear"></div>
    </div>

    <%-- footer --%>
    <tiles:insertAttribute name="footer" />

<script type="text/javascript" src="js/common.js"></script>
</body>
</html>