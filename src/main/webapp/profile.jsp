<%--
  Created by IntelliJ IDEA.
  User: batcomputer-mac
  Date: 9/16/20
  Time: 6:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<div class="container">
    <h1>Welcome, ${sessionScope.user}!</h1>
</div>

</body>
</html>