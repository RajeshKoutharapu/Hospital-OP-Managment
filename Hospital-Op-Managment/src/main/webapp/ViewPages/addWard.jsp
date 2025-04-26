<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f7f7f7;
      text-align: center;
      padding: 50px;
    }

    h2 {
      color: #333;
    }

    form {
      background-color: white;
      display: inline-block;
      padding: 30px 40px;
      border-radius: 8px;
      box-shadow: 0 0 12px rgba(0,0,0,0.1);
    }

    label {
      display: block;
      margin-top: 15px;
      font-weight: bold;
      text-align: left;
    }

    input[type="text"],
    input[type="number"] {
      width: 300px;
      padding: 8px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    input[type="submit"] {
      margin-top: 20px;
      padding: 10px 25px;
      background-color: #007bff;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
  <h2>Add New Ward</h2>
  <form action="/ward/save" method="post">
    <label for="wardName">Name:</label>
    <input type="text" name="wardName" required />

    <label for="totalBeds">Total Beds:</label>
    <input type="number" name="totalBeds" required />

    <label for="occupiedBeds">Occupied Beds:</label>
    <input type="number" name="occupiedBeds" required />

    <input type="submit" value="Save" />
  </form>
</body>
</html>
