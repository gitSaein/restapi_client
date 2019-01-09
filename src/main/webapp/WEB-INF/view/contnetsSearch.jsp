<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<title>Contents Main</title>
	<script type="text/javascript">
	  $( function() {
		  $( ".date_contents" ).datepicker({dateFormat : 'yy-mm-dd'});
	    
	  } );
	  function contnetsSearchReqFunction(form){
		  var formData = decodeURIComponent($("#" + form ).serialize());
		  
		  $.ajax({
			  method: "POST",
			  url:"/rest/search/contents",
			  data: formData,
			  dataType: "json",
			  contentType: "application/x-www-form-urlencoded; charset=UTF-8"
		  })
		  .done(function(data){
			  alert("ok");
			  $("#outStartDate").append("<th>" + data.startDate + "~" + data.endDate + "</th>");
		  })
		  .fail(function(){
			  alert("error");
		  });
	  }
	  function makeTable(){
		  
	  }
	</script>
</head>
<body>

	<form id="contnetsForm">
		<table>
		    <tr>
		        <th colspan="4">통합 검색어 트렌드</th>
		    </tr>
			<tr>
				<th>조회 기간 시작 날짜</th>
				<td><input class="date_contents" name="startDate" type="text"/></td>
				<th>조회 기간 종료 날짜</th>
				<td><input class="date_contents" name="endDate"   type="text"/></td>
			</tr>
			<tr>
				<th>구간 단위</th>
				<td>
					<select name="timeUnit">
		  				<option value="date" selected="selected">일간</option>
		  				<option value="week">주간</option>
		  				<option value="month">월간</option>
					</select>
		        </td>
		     </tr>
		     <tr>
				<th>주제어</th>
				<td><input name="groupName" type="text"/></td>
				<th>주제어에 해당하는 검색어</th>
				<td><input name="keyword" type="text"/></td>
			</tr>
		</table>
	</form>
	<button onclick='contnetsSearchReqFunction("contnetsForm")'>검색</button>
	<table>
	   <thead>
		    <tr>
		    	<th>No.</th>
		        <th>조회 기간 시작 날짜</th>
		        <th>조회 기간 종료 날짜</th>
		        <th>구간 단위</th>
		    	<th>주제어</th>
		    	<th>주제어에 해당하는 검색어</th>
		    	<th>구간별 period</th>
		    	<th>검색 ratio</th>
		   </tr>
 	   </thead>
	</table>


</body>
</html>