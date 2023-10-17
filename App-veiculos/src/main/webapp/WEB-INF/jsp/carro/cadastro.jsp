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
	  <h2>Cadastramento de Carros</h2>
	  
	  <form action="/carro/incluir" method="post">
	  
		<c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>
		
	    <div class="mb-3 mt-3">
	      <label for="qtdePortas">Quantidade portas:</label>
	      <input type="text" id="qtdePortas" name="qtdePortas" class="form-control" value="4" placeholder="Entre com a quantidade de portas">
	    </div>

	    <div class="mb-3 mt-3">
	      <label for="qtdeAssentos">Quantidade de assentos:</label>
	      <input type="text" class="form-control" id="qtdeAssentos" value="5" placeholder="Entre com a quantidade de assentos" name="qtdeAssentos">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>