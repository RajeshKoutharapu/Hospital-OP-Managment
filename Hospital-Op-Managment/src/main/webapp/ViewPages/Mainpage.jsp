<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
  <style>
    .entire{
        display: flex;
        justify-content: center;
    }
    .registerdiv{
    margin-top: 100px;
    margin-left: 100px;
    width: 500px;
    border-style:solid;
    border-radius: 2px;
    border-color: gray;


    }
    .registerdiv input{
        height: 30px;
        width: 300px;
        margin-left: 30px;

    }
    .registerdiv p{
        margin-left: 20px;
        display: inline-blocks;
    }
    .registerdiv button{
        margin-left: 250px;
        padding-left: 25px;
        padding-right: 25px;
        padding-top: 10px;
        padding-bottom: 10px;
        margin-bottom: 30px;

    }
    .registerdiv h1
    {
        padding-left: 100px;
        display: inline;
    }
    .registerdiv button:hover{
        color: white;
        background-color: gray;
        border-style: none;
    }
    .registerdiv button:active{
        color: gray;
        background-color: white;
    }
    .checkdiv{
        margin-left: 200px;
        margin-top: 100px;
        border-style:solid;
    border-radius: 2px;
    border-color: gray;
    }
    .checkdiv p{
        margin-left: 20px;
        margin-right:20px
        display: inline-blocks;
    }
    .checkdiv input{
        height: 30px;
        margin-right:20px;
        display: inline-blocks;
    }
    .checkdiv h1
    {
        text-align:center;
        padding-left: 80px;
        padding-right: 20px;
        display: inline;
    }
    .checkdiv input{
        height: 30px;
        width: 300px;
        margin-left: 30px;

    }
    .checkdiv button{
        margin-left: 200px;
        padding-left: 25px;
        padding-right: 25px;
        padding-top: 10px;
        padding-bottom: 10px;
        margin-bottom: 40px;
        margin-top: 50px;

    }
    .checkdiv button:hover{
        color: white;
        background-color: gray;
        border-style: none;
    }
    .checkdiv button:active{
        color: gray;
        background-color: white;
    }
    .heading{
    height:100px;
    background-color: gray;
    border-radius: 3px;
    }
    .heading h1{
    text-align: center;
   padding-top: 40px;
   color: white;
    
  
          }
  </style>
    </head>
    <body>
    <div class="heading">
             <h1> <marquee>DR.RAJESH HOSPITALS AND DIOGONSITS</marquee></h1>
    </div>
        <div class="entire">
        <div class="registerdiv">
            <form action="register" method="post"> 
            <h1>Patient Registration</h1>
   <p>Patient name<input type="text" name="pname" required="required"></p> 
   <p>Patient Location<input type="text" name="plocation" required="required"></p> 
      <p>Patient Age<input type="number" name="page" required="required"></p> 
     <p>Patient Gender<input type="text" name="pgender" required="required"></p> 
      <p>Doctor Reference<input type="text" name="pdoctor" required="required"></p> 
      <button>Submit</button>
 </form>
        </div>
        <form action="checker" method="post">
        <div class="checkdiv">
            <h1>Op Status Checking</h1>
            <p>Patient name<input type="text" name="pname" placeholder="entercorrect name"></p> 
            <button>Submit</button>
          
        </div> </form>
          
     
      
    </div>
    </body>
</html>