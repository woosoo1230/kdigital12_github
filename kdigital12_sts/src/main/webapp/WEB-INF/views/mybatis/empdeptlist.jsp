<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>선택한 부서 번호는
	<c:forEach items="${paramValues.dept }" var="dept">
		${dept },
	</c:forEach>
	입니다.</h1>
<h1>선택한 부서의 사원 정보</h1>
	<c:forEach items="${empdeptlist }" var="empvo">
		이름 : ${empvo.last_name }, ${empvo.first_name }<br>
		부서코드 : ${empvo.department_id }<br>
		급여 정보 : ${empvo.salary }<br>
		<hr>
	</c:forEach>
</body>
</html>