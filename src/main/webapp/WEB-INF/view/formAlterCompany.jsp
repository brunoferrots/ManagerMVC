<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/30/2023
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/gateway" var="linkGatewayServlet" />

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${linkGatewayServlet}" method="post">
        <h2>Company Data</h2>
        <span>Name: </span>
        <input type="text" name="name" value="${company.name}" />
        <span>Date: </span>
        <input type="text" name="date" value="<fmt:formatDate value="${company.dateOpened}" pattern="dd/MM/yyyy"/>">
        <input type="hidden" name="id" value="${company.id}"/>
        <input type="hidden" name="action" value="AlterCompany"/>
        <button type="submit">Send</button>
    </form>

</body>
</html>
