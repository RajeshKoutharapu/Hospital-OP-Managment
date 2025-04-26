<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Operation Management</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 0;
    }
    .header {
        background-color: #34495e;
        color: white;
        text-align: center;
        padding: 20px 0;
        font-size: 28px;
        font-weight: bold;
        letter-spacing: 1px;
    }
    .container {
        display: flex;
        justify-content: space-around;
        padding: 40px;
        flex-wrap: wrap;
    }
    .card {
        background-color: white;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        padding: 30px;
        border-radius: 8px;
        width: 400px;
        margin: 20px;
    }
    .card h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #2c3e50;
    }
    .card label {
        display: block;
        margin: 10px 0 5px;
        color: #34495e;
    }
    .card input {
        width: 100%;
        padding: 8px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    .card button {
        background-color: #2c3e50;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        width: 100%;
        cursor: pointer;
        font-weight: bold;
    }
    .card button:hover {
        background-color: #1abc9c;
    }
    .footer-action {
        text-align: center;
        margin-top: 30px;
    }
    .footer-action form button {
        width: 200px;
        margin: 0 auto;
        background-color: #2980b9;
    }
</style>
</head>
<body>

<div class="header">Dr. Rajesh Hospitals & Diagnostics</div>

<div class="container">
    <!-- Patient Registration -->
    <div class="card">
        <h2>Patient Registration</h2>
        <form action="register" method="post">
            <label for="pname">Patient Name</label>
            <input type="text" name="pname" required>

            <label for="plocation">Patient Location</label>
            <input type="text" name="plocation" required>

            <label for="page">Patient Age</label>
            <input type="number" name="page" required>

            <label for="pgender">Patient Gender</label>
            <input type="text" name="pgender" required>

            <label for="pdoctor">Doctor Reference</label>
            <input type="text" name="pdoctor" required>

            <button type="submit">Submit</button>
        </form>
    </div>

    <!-- OP Status Check -->
    <div class="card">
        <h2>OP Status Check</h2>
        <form action="checker" method="get">
            <label for="pname">Patient Name</label>
            <input type="text" name="pname" placeholder="Enter correct name" required>
            <button type="submit">Check Status</button>
        </form>
    </div>

    <!-- Admit Patient -->
    <div class="card">
        <h2>Admit Patient</h2>
        <form action="admit" method="post">
            <label for="patientId">Patient ID</label>
            <input type="number" name="patientId" required>

            <label for="wardId">Ward Number</label>
            <input type="text" name="wardId" required>

            <label for="bedNumber">Bed Number</label>
            <input type="number" name="bedNumber" required>

            <button type="submit">Admit</button>
        </form>
    </div>

</div>

<div class="footer-action">
    <form action="/ward" method="get">
        <button type="submit">Manage Wards</button>
    </form>
</div>

</body>
</html>
