<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>HW</title>
</head>
<body>
Hello world from spring boot!

<p>
List of users
<table border ="1">
    <thead>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
    </thead>
    <tbody>
        <c:forEach items="${people}" var="person">
            <tr>
                <td>${person.personId}</td>
                <td>${person.personName}</td>>
                <td>${person.age}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<p>
<a href ="/orders">Go to order list</a>

</body>
</html>