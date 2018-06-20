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
    <title>Edit book</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-book-style.css" />

</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>Library - books manager.</h2>
        </div>
    </div>

    <div id="container">
        <h3>Save book</h3>

        <form:form action="saveBook" modelAttribute="book" method="post">

            <form:hidden path="id"/>

            <table>

                <tr>
                    <td><label>Title:</label></td>
                    <td><form:input path="title"/></td>
                </tr>

                <tr>
                    <td><label>Description:</label></td>
                    <td><form:input path="description"/></td>
                </tr>

                <tr>
                    <td><label>Author:</label></td>
                    <td><form:input path="author"/></td>
                </tr>

                <tr>
                    <td><label>Year:</label></td>
                    <td><form:input path="printYear"/></td>
                </tr>

                <tr>
                    <td><label>ISBN:</label></td>
                    <td><form:input path="isbn"/></td>
                </tr>

                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Save" class="save"/></td>
                </tr>


            </table>

        </form:form>

        <p>
            <a href="${pageContext.request.contextPath}/books/list">Back to list</a>
        </p>

    </div>


</body>
</html>
