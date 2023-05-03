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
    <title>Title</title>
</head>
<body>
    <form action="${linkGatewayServlet}" method="post">
        <h2>Company Data</h2>
        <span>Name: </span>
        <input type="text" name="name"/>
        <span>Date: </span>
        <input type="text" name="date">
        <input type="hidden" name="action" value="NewCompany"/>
        <button type="submit">Send</button>
    </form>

</body>
</html>
