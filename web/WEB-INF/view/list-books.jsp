<%--
  Created by IntelliJ IDEA.
  User: alexey
  Date: 16/06/2018
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer list</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>


<div id="wrapper">
    <div id="header">
        <h2>Library - books managment tool</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add book" onclick="window.location.href='addBook'; return false;" class="add-button"/>

        <table>
            <tr>
                <th>Title</th>
                <th>Description</th>
                <th>Author</th>
                <th>Year</th>
                <th>ISBN</th>
                <th>Readed</th>
                <th>Actions</th>

            </tr>

            <c:forEach var="tempBook" items="${books}">

                <c:url var="updateLink" value="/books/updateBook">
                    <c:param name="bookId" value="${tempBook.id}"></c:param>
                </c:url>

                <c:url var="deleteLink" value="/books/delete">
                    <c:param name="bookId" value="${tempBook.id}"></c:param>
                </c:url>

                <c:url var="readLink" value="/books/setRead">
                    <c:param name="bookId" value="${tempBook.id}"></c:param>
                </c:url>

                <tr>
                    <td>${tempBook.title}</td>
                    <td>${tempBook.description}</td>
                    <td>${tempBook.author}</td>
                    <td>${tempBook.printYear}</td>
                    <td>${tempBook.isbn}</td>
                    <td>${tempBook.readAlready}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                        |
                        <a href="${readLink}" onclick="if(!(confirm('Mark as readed?'))) return false;">Read</a>
                        |
                        <a href="${deleteLink}"
                            onclick="if(!(confirm('Delete book?'))) return false;">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
