<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>修改员工信息</title>
		<link rel="stylesheet" href="${ pageContext.servletContext.contextPath }/css/index_work.css" />
	</head>
	
	<body>
		
		<form:form action="${ pageContext.servletContext.contextPath }/emp" method="post">
			<input type="hidden" name="id" value="${ emp.id }" />
			<input type="hidden" name="_method" value="PUT" />
			<table>
				<tr>
					<th colspan="2">编辑员工信息</th>
				</tr>
				
				<tr>
					<td>LASTNAME</td>
					<td>
						<form:input path="lastName" />
					</td>
				</tr>
				
				<tr>
					<td>EMAIL</td>
					<td>
						<form:input path="email" />
					</td>
				</tr>	
				
				<tr>
					<td>GENDER</td>
					<td>
						<input type="radio" name="gender" value="1" ${ emp.gender == 1?'checked':'' }/>男
						<input type="radio" name="gender" value="0" ${ emp.gender == 0?'checked':'' }/>女
					</td>
				</tr>
				
				<tr>
					<td>DEPARTMENT</td>
					<td>
						<select name="department.id">
							<option>SELECT DEPARTMENT</option>
							<c:forEach items="${ depts }" var="dept">
								<option value="${ dept.id }" ${ dept.id == emp.department.id?'selected':'' }>${ dept.departmentName }</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="UPDATE" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>