<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/30/2023
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Company Created</title>
</head>
<body>
    <c:if test="${not empty companyName}">
      <h2>Company created with success!</h2>
      <p>Name : ${companyName} </p>
      <p>Id : ${companyId} </p>
      <p>Date : <fmt:formatDate value="${companyDate}" pattern="dd/MM/yyyy"/> </p>
    </c:if>

    <c:if test="${empty companyName}">
      <h2>No company registered</h2>
    </c:if>

</body>
</html>
