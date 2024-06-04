<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 .heading{
    height:50px;
    background-color:purple;
    border-radius: 3px;
    }
    .heading h1{
    text-align: center;
   padding-top: 10px;
   color: white;
     }
     .infodiv{
    margin-left: 40%;
     margin-right: 40%;
    
    margin-top: 100px;
    border-style: solid;
    border-color: gray;
     }
     .infodiv p{
     text-align: center;
     }
     button{
       padding-left: 20px;
       padding-right: 20px;
       padding-bottom: 10px;
       padding-top: 10px;
       margin-left: 45%;
       margin-right: 40%;
       margin-top:50px;
       
     }
          </style>
</head>
<body>
<form action="back" method="get">
<div class="heading">
             <h1> PATIENT DETAILS</h1>
    </div>
    <div class="infodiv">
    <c:forEach var="item" items="${details}">
  <p> Name : ${item.getPname()}</p>
  <hr>
    <p>Location :${item.getPlocation()}</p>  <hr>
      <p>Age : ${item.getPage()}</p>  <hr>
        <p> Doctor name:${item.getPdoctor()}</p>  <hr>
          <p> RigesterDay :${item.getRigesterDay()}</p>  <hr>
            <p> Expires on :${item.getLastDay()}</p>
</c:forEach></div>

         <h3 style="color:red; text-align: center"> ${res}</h3>
         <button>Back to home</button>
         </form>
</body>
</html>