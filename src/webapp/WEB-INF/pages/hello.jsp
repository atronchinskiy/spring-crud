<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach var="msq" items="${messages}">
    <h1>${msq}</h1>
</c:forEach>

<a href="\cars?locale=en">EN</a>
<a href="\cars?locale=ru">RU</a>

</body>
</html>