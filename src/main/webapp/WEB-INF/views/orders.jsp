<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>HW</title>
</head>
<body>
Hello world from spring boot!

<p>
    List of orders
<table border ="1">
    <thead>
    <th>Order Id</th>
    <th>Person Id</th>
    <th>Status</th>
    </thead>
    <tbody>
    <c:forEach items="${orderList}" var="orders">
        <tr>
            <td>${orders.orderId}</td>
            <td>${orders.personId}</td>>
            <td>${orders.status}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<p>
<a href ="/">Return to user list</a>


</body>
</html>