<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      font-family: Arial;
      background-color: #f0f0f0;
      padding: 20px;
    }

    h2 {
      text-align: center;
      color: #333;
    }

    table {
      width: 80%;
      margin: auto;
      border-collapse: collapse;
      background-color: white;
      box-shadow: 0 0 8px rgba(0,0,0,0.1);
    }

    th, td {
      padding: 12px;
      text-align: center;
      border: 1px solid #ddd;
    }

    th {
      background-color: #343a40;
      color: white;
    }

    a {
      display: block;
      text-align: center;
      margin: 20px;
      text-decoration: none;
      color: white;
      background-color: #28a745;
      padding: 10px 20px;
      border-radius: 5px;
    }

    a:hover {
      background-color: #218838;
    }
  </style>
</head>
<body>
  <h2>Ward List</h2>
  <a href="/ward/add">Add New Ward</a>
  <table>
    <tr><th>ID</th><th>Name</th><th>Total Beds</th><th>Occupied Beds</th><th>Available Beds</th></tr>
    <c:forEach var="w" items="${wards}">
      <tr>
        <td>${w.id}</td>
        <td>${w.wardName}</td>
        <td>${w.totalBeds}</td>
        <td>${w.occupiedBeds}</td>
        <td>${w.totalBeds - w.occupiedBeds}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
