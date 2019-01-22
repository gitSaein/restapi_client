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
<script type="text/javascript">
	function createUser(form){
		var formData = decodeURIComponent($("#" + form ).serialize());
		$.ajax({
			method: "POST",
			url:"/rest/create/user",
			data: formData
		})
		.done(function(data){
			alert("Ok");
		})
		.fail(function(){
			alert("error");
		});
	
	}
</script>
</head>
<body>
<form id="createUserform">
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
    </tbody>
</table>
</form>
<input type="button" value="사용자 등록" onclick='createUser("createUserform")'/>
<table>
    <thead>
       <tr><th colspan="3">등록된 사용자</th></tr>
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
    </tbody>
</table>

</body>
</html>