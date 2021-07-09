<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>展示员工信息</title>
		<link rel="stylesheet" href="${ pageContext.servletContext.contextPath }/css/index_like.css" />
	</head>
	
	<body>
		<table>
			<tr>
				<th>ID</th>
				<th>LASTNAME</th>
				<th>EMAIL</th>
				<th>GENDER</th>
				<th>DEPARTMENTNAME</th>
				<th>OPTION</th>
			</tr>
			
			<c:forEach items="${ emps }" var="emp">
				<tr>
					<td>${ emp.id }</td>
					<td>${ emp.lastName }</td>
					<td>${ emp.email }</td>
					<td>${ emp.gender }</td>
					<td>${ emp.department.departmentName }</td>
					<td>
						<a href="emp">UPDATE</a>
						<a href="emp">DELETE</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>