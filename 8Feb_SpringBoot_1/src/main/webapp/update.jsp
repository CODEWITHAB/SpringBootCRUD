<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<h2>Update Data</h2>
</head>
<body bgcolor="tomato">
<form action="update">
<pre>
    <input type="hidden" name="id" value=${s.id }><br><br>
  
<tr><td>Username:-</td><td><input type="text" name="uname" value="${s.uname }"></td></tr>
<tr><td>Password:-</td><td><input type="text" name="pass" value="${s.pass }"></td></tr>
<tr><td>Name:-</td><td><input type="text" name="name" value="${s.name }"></td></tr>
<tr><td>MobileNo:-</td><td><input type="text" name="mobno" value="${s.mobno}"></td></tr>
 
<tr><td>  <input type="submit" value="Update"> </tr></td>
</table>
</form>`
</body>
</html>