<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="ch"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include>
</jsp:include>

<%
	for(Admin admin:adminInfo)
	{
		System.out.println(admin.adminName);
	}

%>
<!-- assuming adminInfo as a collection object -->
<ch:forEach items="${adminInfo}" start="1" end="5" step="1" var="admin">
	<ch:out value="${admin.adminName}"></ch:out>
	<ch:out value="${admin.adminContact}"></ch:out>
	

</ch:forEach>




</body>
</html>