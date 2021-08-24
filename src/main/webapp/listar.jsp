<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Exames</h1>
	
	<form action="viewListar" method="POST"></form>
	
	<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>ID Paciente</th>
						<th>Nome Paciente</th>
						<th>Nome Exame</th>
						<th>Data Exame</th>
						<th>Resultado Exame</th>

					</tr>
				</thead>
				<s:iterator value="retorna">
					<tr>
						<td><s:property value="id_paciente" /></td>
						<td><s:property value="nome_paciente" /></td>
						<td><s:property value="nome_exame" /></td>
						<td><s:property value="data_exame" /></td>
						<td><s:property value="resultado_exame" /></td>
					</tr>
				</s:iterator>
			</table>
	
</body>
</html>