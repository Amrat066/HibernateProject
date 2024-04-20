<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manage Books</title>
</head>
<body>
    <h3>Available Books Details</h3>
    <%@ page import="java.util.List, hibernateWebApp.Book" %>
    <%
        List<Book> books = (List<Book>)request.getAttribute("books");
    %>
    <h4>Total Number of Books are <%= books.size() %></h4>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>ISBN</td>
            <td>NAME</td>
            <td>AUTHOR</td>
            <td>PUBLISHER</td>
            <td>PRICE</td>
        </tr>
        <% for (Book book : books) { %>
        <tr>
            <td><%= book.getId() %></td>
            <td><%= book.getIsbn() %></td>
            <td><%= book.getName() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getPublisher() %></td>
            <td><%= book.getPrice() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
