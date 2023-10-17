<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>CarLot</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de van</h2>
	  
		<form action="/van/incluir" method="post">
		
		  <c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>
		  
		  <div class="mb-3 mt-3">
			<label for="cc">Tipo:</label>
			<input type="text" class="form-control" id="tipo" value="Escolar" placeholder="Entre com o tipo da van" name="tipo">
		  </div>
  
		  <div class="mb-3 mt-3">
			<label for="cat">Passeio:</label>
			<input type="checkbox" id="passeio" name="passeio">
		  </div>
  
		  <button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>