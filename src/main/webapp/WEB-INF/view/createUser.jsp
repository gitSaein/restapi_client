<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
    <thead>
       <tr><th colspan="3">사용자 가입</th></tr>
    </thead>
    <tbody>
		<tr>
		  <th scope="row">사용자 ID</th>
		  <td><input type="text"/><input type="button" value="ID중복검사"/></td>
		</tr>
		<tr>
		  <th scope="row">사용자 Password</th>
		  <td><input type="text"/></td>
		</tr>
		<tr>
		  <th scope="row">등록</th>
		  <td><input type="button" name="" value="등록"/></td>
		</tr>		
    </tbody>
</table>
</body>
</html>