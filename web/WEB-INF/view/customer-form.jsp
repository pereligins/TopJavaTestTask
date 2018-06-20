<%--
  Created by IntelliJ IDEA.
  User: alexey
  Date: 16/06/2018
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit customer</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />

</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - customer relationship manager.</h2>
        </div>
    </div>

    <div id="container">
        <h3>Save customer</h3>

        <form:form action="saveCustomer" modelAttribute="customer" method="post">

            <form:hidden path="id"/>

            <table>
                <tr>
                    <td><label>Last name:</label></td>
                    <td><form:input path="lastName"/></td>
                </tr>

                <tr>
                    <td><label>First name:</label></td>
                    <td><form:input path="firstName"/></td>
                </tr>

                <tr>
                    <td><label>Email:</label></td>
                    <td><form:input path="email"/></td>
                </tr>

                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Save" class="save"/></td>
                </tr>


            </table>

        </form:form>

        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
        </p>

    </div>


</body>
</html>
