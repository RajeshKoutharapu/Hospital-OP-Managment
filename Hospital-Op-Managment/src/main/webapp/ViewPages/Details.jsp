<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="item" items="${details}">
  <p>Item: ${item.getpname()}</p>
    <p>Item: ${item.getplocation()}</p>
      <p>Item: ${item.getpage()}</p>
        <p>Item: ${item.getpdoctor()}</p>
          <p>Item: ${item.getprigesterDay()}</p>
            <p>Item: ${item.getplastDay()}</p>
</c:forEach>
<p> ${res}</p>
</body>
</html>