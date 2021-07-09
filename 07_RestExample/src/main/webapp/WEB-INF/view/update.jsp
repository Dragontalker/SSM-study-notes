<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>修改员工信息</title>
		<link rel="stylesheet" href="${ pageContext.servletContext.contextPath }/css/index_work.css" />
	</head>
	
	<body>
		
		<form action="emp" method="post">
			<table>
				<tr>
					<th colspan="2">修改员工信息</th>
				</tr>
				
				<tr>
					<td>LASTNAME</td>
					<td>
						<input type="text" name="lastName" value="${ emp.lastName }" }/>
					</td>
				</tr>
				
				<tr>
					<td>EMAIL</td>
					<td>
						<input type="text" name="email" value="${ emp.email }"/>
					</td>
				</tr>	
				
				<tr>
					<td>GENDER</td>
					<td>
						<input type="radio" name="gender" value="1" <c:if test="${ emp.gender == 1 }">checked="checked"</c:if> />男
						<input type="radio" name="gender" value="0" <c:if test="${ emp.gender == 0 }">checked="checked"</c:if> />女
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
						<input type="submit" value="ADD" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>