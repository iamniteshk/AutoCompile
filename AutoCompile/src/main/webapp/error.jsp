<%@ page language="java" isErrorPage="true" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Error Page</title>
</head>
<body>
<% if(response.getStatus() == 500){ %>
<font color="white">Error: <%=exception.getCause() %></font><br>
<%-- <%
       String errArray = ((com.ofss.processor.CompileException)exception).getErrors();
        out.println(errArray);
         
    %>  --%>
<%-- include login page --%>

<%@ include file="index.jsp"%>

<%}else {%>
Hi There, error code is <%=response.getStatus() %><br>
Please go to <a href="/index.jsp">home page</a>
<%} %> 
</body>
</html>