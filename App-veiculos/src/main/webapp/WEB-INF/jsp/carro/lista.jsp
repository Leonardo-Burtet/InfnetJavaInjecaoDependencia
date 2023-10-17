<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>AppPedido</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
	  <h3>Listagem de Carros:</h3>
	  <h4><a href="/carro/cadastro">Novo Carro</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>C�digo</th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="c" items="${listaCarro}">
		      <tr>
		        <td>${c.id}</td>
		        <td>${c.nome}</td>
		        <td>${c.valor}</td>
		        <td>${c.codigo}</td>
		        <td>${c.tetoSolar}</td>
		        <td>${c.qtdePortas}</td>
		        <td>${c.qtdeAssentos}</td>
		        <td><a href="/carro/${c.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>