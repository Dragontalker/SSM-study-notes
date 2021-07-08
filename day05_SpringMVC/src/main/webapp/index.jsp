<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
	</head>
	
	<body>
	
		Day 05 - Spring MVC
		
		<hr>
		
		<a href="testREST/1001" method="GET">Test GET</a>
		
		<hr>
		
		<form action="testREST" method="POST"> 
			<input type="submit" value="POST测试" />
		</form>
		
		<hr>
		
		<form action="testREST" method="POST"> 
			<input type="hidden" name="_method" value="PUT" />
			<input type="submit" value="PUT测试" />
		</form>
		
		<hr>
		
		<form action="testREST/1001" method="POST"> 
			<input type="hidden" name="_method" value="DELETE" />
			<input type="submit" value="DELETE测试" />
		</form>
	
	</body>
</html>