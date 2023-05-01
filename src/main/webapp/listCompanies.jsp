<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/29/2023
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List, com.lychee.managermvc.model.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>List Companies</title>
</head>
<body>
    <c:if test="${not empty companyName}">
        <h2>Company created with success!</h2>
        <p>Name : ${companyName} </p>
        <p>Id : ${companyId} </p>
        <p>Date : <fmt:formatDate value="${companyDate}" pattern="dd/MM/yyyy"/> </p>
    </c:if>

    <ul>
        <h2>Companies:</h2>
        <c:forEach items="${listCompanies}"  var="company">
            <li>
                    ${company.name}
                <fmt:formatDate value="${company.dateOpened}" pattern="dd/MM/yyyy"/>
                <a href="/ManagerMVC/gateway?action=showCompany&id=${company.id}">Edit</a>
                <a href="/ManagerMVC/gateway?action=removeCompany&id=${company.id}">Remove</a>
            </li>
        </c:forEach>
    </ul>

</body>
</html>
