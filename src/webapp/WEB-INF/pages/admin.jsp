<%--
  Created by IntelliJ IDEA.
  User: tab65
  Date: 13.04.2020
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

    <form method="post" action='<c:url value="/admin" />' style="display:inline;">
        FirststName: <input type="text" name="firstName"/>
        LastName: <input type="text" name="lastName"/>
        Email: <input type="text" name="email"/>
        <input type="submit" value="Add new user">
    </form>
    <table>
        <tr>
            <th>ID</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Email</th>
        </tr>

        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>
                <td>
                    <form method="get" action='<c:url value="/edit" />' style="display:inline;">
                        <input type="hidden" name="id" value="${user.id}">
                        <input type="hidden" name="firstName" value="${user.firstName}">
                        <input type="hidden" name="lastName" value="${user.lastName}">
                        <input type="hidden" name="email" value="${user.email}">
                        <input type="submit" value="Edit">
                    </form>

                    <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                        <input type="hidden" name="id" value="${user.id}">
                        <input type="hidden" name="firstName" value="${user.firstName}">
                        <input type="hidden" name="lastName" value="${user.lastName}">
                        <input type="hidden" name="email" value="${user.email}">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>

        </c:forEach>

    </table>

</body>
</html>
