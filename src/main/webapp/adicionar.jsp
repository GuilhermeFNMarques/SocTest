<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Insira um exame</h1>
	
	<form action="viewAdicionar" method="POST">
		Id do Paciente: <input type="number" name="consultaExame.id_paciente">
		Nome do Paciente: <input type="text" name="consultaExame.nome_paciente">
		Nome do Exame: <input type="text" name="consultaExame.nome_exame">
		Data do Exame: <input type="date" name="consultaExame.data_exame"><br><br>
		Resultado do Exame: <input type="text" name="consultaExame.resultado_exame">
		<button>Adicionar Exame</button>
	</form>
	
</body>
</html>