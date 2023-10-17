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
	  <h2>Cadastramento de motos</h2>
	  
	  <form action="/moto/incluir" method="post">
	  
		<c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>
		
	    <div class="mb-3 mt-3">
	      <label for="cc">Cilindradas:</label>
	      <input type="text" class="form-control" id="qtdeCilindrada" value="150" placeholder="Entre com a cilindrada do motor" name="qtdeCilindrada">
	    </div>

	    <div class="mb-3 mt-3">
	      <label for="cat">Categoria:</label>
	      <input type="text" class="form-control" id="categoria" value="Esportiva" placeholder="Entre com a categoria" name="categoria">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>