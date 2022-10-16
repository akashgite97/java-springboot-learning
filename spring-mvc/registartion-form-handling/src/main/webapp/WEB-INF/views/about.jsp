<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<h2>About JSP page</h2>

    <%
   String name= (String)request.getAttribute("name");
     %>
      <h1>Name is : <%=name%></h1>
</body>
</html>
