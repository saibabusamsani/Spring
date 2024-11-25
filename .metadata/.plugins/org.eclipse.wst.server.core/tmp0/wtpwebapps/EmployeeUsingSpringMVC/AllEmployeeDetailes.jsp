<%@page import="com.example.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

	table{
		
		margin-left: 30%
		;margin-top: 2vw
	}
</style>
<body>


<h1 style="margin-left: 40%">Employee Detailes</h1>

<form action="Registration.jsp" style="margin-left: 40%">
	<input value="add new employee" type="submit"/>
</form>
 <%List<Employee> listOfEmployees=(List<Employee>)request.getAttribute("listOfEmployee"); %>
		<table  border="1" cellspacing="0" cellpadding="8" >
			<tr>
					<th>id</th>
				<th>name</th>
				<th>salary</th>
				<th>deptno</th>
			</tr>
			<%for(Employee i:listOfEmployees){ %>
			<tr>
				<td><%=i.getEmp_id() %></td>
				<td><%=i.getEmp_name() %></td>
				<td><%=i.getEmp_salary() %></td>
				<td><%=i.getEmp_depatno() %></td>
				<td>
					<form action="getEmployeeByID"> 
							<input value=<%= i.getEmp_id()%> name="emp_id" hidden="true">
							<input type="submit" value="update"/>
					</form>
				 </td>
				<td>
					<form action="remove"> 
							<input value=<%=i.getEmp_id() %> name="emp_id" hidden="true">
							<input type="submit" value="remove"/>
					</form>
				 </td>
				
			</tr>
			
			<%} %>
			
		
		</table>
</body>
</html>