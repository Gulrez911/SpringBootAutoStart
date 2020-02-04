<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
Welcome Gulrez 2

<button onclick="getUser(2)">Click</button>
<p id="user"></p>
<script>
function getUser(id){
	console.log(id)
	$.ajax({
		url:"getUser?id="+id,
		type:"GET",
		success: function(response){
			console.log(response.data);
			$("#user").text(response.data.id+" : "+response.data.firstName+" : "+response.data.lastName+" : "+response.data.email)
			}
		});
}

</script>
</body>
</html>