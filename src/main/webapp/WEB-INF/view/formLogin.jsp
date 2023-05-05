<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/30/2023
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/gateway" var="linkGatewayServlet" />
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="${linkGatewayServlet}" method="post">
        <h2>Data Access</h2>
        <label>Login: <input type="text" name="login"/></label>
        <label>Password:<input type="password" name="password"></label>
        <input type="hidden" name="action" value="Login"/>
        <button type="submit">Send</button>
    </form>

</body>
</html>
