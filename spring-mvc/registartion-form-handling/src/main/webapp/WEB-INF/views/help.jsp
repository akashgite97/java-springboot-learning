<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<html>
<body>
<h2>help jsp</h2>
  <%
   String name= (String)request.getAttribute("name");
     %>
      <h1 style="color:red">Name is : ${name}</h1>
</body>
</html>
