<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="head.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Login</title>
    <meta charset="utf-8">
</head>
<body>
<center>
    <div class="box">
        <form:form method="post" modelAttribute="loginForm">
            <table>
                <tr>
                <tr class="tg">
                    <th colspan="2"><h4>User Login</h4></th>
                <tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="login" type="text"/></td>
                    <td><form:errors path="login"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:input path="password" type="password"/></td>
                    <td><form:errors path="password"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit"
                                                          value="Submit"></td>
                </tr>
            </table>
        </form:form>
    </div>
</center>
</body>
</html>