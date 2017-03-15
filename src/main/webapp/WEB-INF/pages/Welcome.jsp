<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp" %>
<html>
<head>
    <title>Welcome</title>
</head>

<div align="center">
    <h1>Contact List</h1>
    <h3><a href="newContact">New Contact</a></h3>
    <table border="1">
        <th>No</th>
        <th>Name</th>
        <th>Last Name</th>
        <th>Middle Name</th>
        <th>Telephone</th>
        <th>HomeTel</th>
        <th>Address</th>
        <th>Email</th>


        <th>Action</th>

        <c:forEach var="contact" items="${listContact}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${contact.firstname}</td>
                <td>${contact.lastname}</td>
                <td>${contact.middlename}</td>
                <td>${contact.telephone}</td>
                <td>${contact.homeTel}</td>
                <td>${contact.address}</td>
                <td>${contact.email}</td>

                <td>
                    <a href="editContact?id=${contact.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="deleteContact?id=${contact.id}">Delete</a>
                </td>

            </tr>
        </c:forEach>
    </table>
</div>

</html>
