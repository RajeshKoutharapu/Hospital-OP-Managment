<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      font-family: Arial;
      background-color: #f1f1f1;
      text-align: center;
      padding: 60px;
    }

    .message {
      background-color: white;
      display: inline-block;
      padding: 30px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    .message p {
      color: green;
      font-size: 20px;
    }

    button {
      margin-top: 20px;
      padding: 10px 25px;
      font-size: 16px;
      background-color: #007bff;
      color: white;
      border: none;
      border-radius: 4px;
    }

    button:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
  <div class="message">
    <p>${detailbean.pname} Registered Successfully</p>
    <form action="back">
      <button type="submit">Back to Home</button>
    </form>
  </div>
</body>
</html>
