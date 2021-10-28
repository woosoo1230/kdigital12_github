<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>부서번호 선택 폼</h1>
<form action="empdeptlist" method="post">
	<input type="checkbox" name="dept" value="10">10 
	<input type="checkbox" name="dept" value="20">20
	<input type="checkbox" name="dept" value="30">30
	<input type="checkbox" name="dept" value="40">40
	<input type="checkbox" name="dept" value="50">50
	<input type="checkbox" name="dept" value="60">60
	<input type="checkbox" name="dept" value="70">70
	<input type="checkbox" name="dept" value="80">80
	<input type="checkbox" name="dept" value="90">90
	<input type="checkbox" name="dept" value="100">100 <br>
	<input type="submit" value="선택">
	
</form>
<%for(int i=1;i<=10;i++){ %>
	<input type="checkbox" name="dept_list" value="<%=i*10%>"><%=i*10 %><br>
<%} %>
</body>
</html>