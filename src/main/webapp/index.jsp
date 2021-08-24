<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Menu</h1>
	<form action="viewListar" method="POST">
<input type="submit" value="Listar Exames">
<a href="adicionar.jsp"><input type="button" value="Adicionar Exame"></a>
<a href="excluir.jsp"><input type="button" value="Excluir Exame"></a>
<a href="atualizar.jsp"><input type="button" value="Alterar Exame"></a>
</form>
</body>
</html>