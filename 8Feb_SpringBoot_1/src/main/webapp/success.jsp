<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h2 align="center">Student Data</h2>
<script type="text/javascript">
function deleteRecord()
{
	alert("Delete");
	document.myform.action="delete";
	document.myform.submit();
}
function addRecord()
{
	alert("Add");
	document.myform.action="add";
	document.myform.submit();
}
function updateRecord()
{
	alert("Update");
	document.myform.action="edit";
	document.myform.submit();
}

</script>
</head>
<body>
<form name="myform">
<table border="1" align="center">
<tr>
<th>Select</th>
<th>Id</th>
<th>Username</th>
<th>Password</th>
<th>Name</th>
<th>MobileNo</th>
</tr>
<c:forEach items="${data}" var="stu">
<tr>
<td><input type="radio" name="id" value="<c:out value="${stu.id}"></c:out>"></td>
<td><c:out value="${stu.id}"></c:out></td>
<td><c:out value="${stu.uname}"></c:out></td>
<td><c:out value="${stu.pass}"></c:out></td>
<td><c:out value="${stu.name}"></c:out></td>
<td><c:out value="${stu.mobno}"></c:out></td>
</tr>
</c:forEach>

<tr>
<td><input type="button" value="Delete" onclick="deleteRecord()"></td>
<td><input type="button" value="Add" onclick="addRecord()"></td>
<td><input type="button" value="Update" onclick="updateRecord()"></td>
</tr>

</table>
</form>
</body>
</html>
