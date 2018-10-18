<%--
  Created by IntelliJ IDEA.
  User: Doomsday
  Date: 17.10.2018
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>User.jsp</title>
</head>
<body>
    <H1>Hello</H1>
    <H3>${requestScope.user.username}</H3>
    <table
            style="border-style: solid; border-width: 1px; width: 800px; border-collapse: collapse;">
        <thead>
        <tr style="background-color: gray;">
            <td style="width: 40px;">ID</td>
            <td style="width: 120px;">User Name</td>
            <td style="width: 120px;">Password</td>
            <td style="width: 120px;">E-Mail</td>
            <td style="width: 120px;">Login</td>
        </tr>
        </thead>
        <tr>
            <td>${requestScope.user.user_id}</td>
            <td>${requestScope.user.username}</td>
            <td>${requestScope.user.password}</td>
            <td>${requestScope.user.email}</td>
            <td>${requestScope.user.last_login}</td>
        </tr>
    </table>
</body>
</html>
