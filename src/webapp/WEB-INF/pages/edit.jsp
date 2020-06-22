<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tab65
  Date: 15.04.2020
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Edit user</title>
</head>
<body>
<h3>Edit user</h3>
        <form method="post" action='<c:url value="/edit" />' style="display:inline;">
                ID: ${id}
                <input type="hidden" name="id" value="${user.id}"/>
                <p></p>
                FirstName: <input type="text" name="firstName" value="${user.firstName}"/>
                LastName: <input type="text" name="lastName" value="${user.lastName}"/>
                Email: <input type="text" name="email" value="${user.email}"/>
                <input type="submit" value="Edit user">
        </form>

        <p></p>
</body>
</html>
