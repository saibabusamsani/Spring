<%@page import="com.example.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<style>
	form{
	display: flex;
	align-items: center;
	justify-content: center;
	gap:1vw;

	;flex-direction: column;
	}
	h1{
	text-align: center;
	}
</style>
<body>

	<h1>Update Detailes</h1>
	<%Employee employee=(Employee)request.getAttribute("employeeDetailes"); %>
	<form action="updateEmployee">
		<input type="text" name="emp_id" value=<%=employee.getEmp_id()%> hidden="true">
		<input type="text" name="emp_name" value=<%=employee.getEmp_name() %>>
		<input type="text" name="emp_salary" value=<%=employee.getEmp_salary() %>>
		<input type="text" name="emp_depatno" value=<%=employee.getEmp_depatno() %>>
		<input type="submit" value="update"/>
	</form>
</body>
</html>