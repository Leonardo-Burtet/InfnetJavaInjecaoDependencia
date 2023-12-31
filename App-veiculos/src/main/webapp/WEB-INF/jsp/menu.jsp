<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">CarLot</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
	  <c:if test="${not empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="/usuario/lista">Usuário</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/reserva/lista">Reserva</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/solicitante/lista">Solicitante</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/veiculo/lista">Veiculos</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/moto/lista">Motos</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/carro/lista">Carros</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/van/lista">Vans</a>
	      </li>
      </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty user}">
	      <li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>      
	      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>
      
      <c:if test="${not empty user}">
      	  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
      </c:if>
    </ul>
  </div>
</nav>