package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import dto.Consultaexame;
import dt.Data;
import jdbc.ConexaoUtil;

//Data Acess Object

public class MConsultaexames {
	
	public void inserir(Consultaexame consultaExame) {
		//criando a conexão com o banco.
		try {
		
		Connection connection = ConexaoUtil.getInstance().getConnection();
		
		String sql = "INSERT INTO CONSULTAEXAME(ID_PACIENTE, NOME_PACIENTE, NOME_EXAME, DATA_EXAME, RESULTADO_EXAME) VALUES(?, ?, ?, ?, ?)";
		
		//ponte entre o banco de dados e o java
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//settando os dados no banco
		statement.setInt(1, consultaExame.getId_paciente());
		statement.setString(2, consultaExame.getNome_paciente());		
		statement.setString(3, consultaExame.getNome_exame());
		
		Data data = new Data();
		
		statement.setString(4, data.formatadata(consultaExame.getData_exame()));
		statement.setString(5, consultaExame.getResultado_exame());
		
		statement.execute();
		connection.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void excluir(String nomePaciente) {
		try {
		Connection connection = ConexaoUtil.getInstance().getConnection();
		
		String sql = "DELETE FROM CONSULTAEXAME WHERE NOME_PACIENTE = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, nomePaciente);
		
		statement.execute();
		statement.close();
		
		} catch (Exception e) {
		e.printStackTrace();
		}
	
	}
	
	public List<Consultaexame> listarExames() {
		List<Consultaexame> listaExame = new ArrayList<Consultaexame>();
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "SELECT * FROM CONSULTAEXAME ORDER BY NOME_PACIENTE AND NOME_EXAME ASC";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			//executeQuery irá retornar uma tabela, o resultset está armazenando ela
			ResultSet resultset = statement.executeQuery();
			
			//Enquanto houver próxima linha
			while(resultset.next()) {
				Consultaexame consultaExame = new Consultaexame();
				//recuperando os dados no banco
				consultaExame.setId_paciente(resultset.getInt("ID_PACIENTE"));
				consultaExame.setNome_paciente(resultset.getString("NOME_PACIENTE"));
				consultaExame.setNome_exame(resultset.getString("NOME_EXAME"));
				consultaExame.setData_exame(resultset.getString("DATA_EXAME"));
				consultaExame.setResultado_exame(resultset.getString("RESULTADO_EXAME"));
				
				listaExame.add(consultaExame);
			}
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listaExame;
	}
	
	public void atualizar(Consultaexame consultaExame) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "UPDATE CONSULTAEXAME SET NOME_PACIENTE = ?, NOME_EXAME = ?, DATA_EXAME = ?, RESULTADO_EXAME = ? WHERE ID_PACIENTE = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, consultaExame.getNome_paciente());
			statement.setString(2, consultaExame.getNome_exame());
			
			Data data = new Data();
			
			statement.setString(3, data.formatadata(consultaExame.getData_exame()));
			statement.setString(4, consultaExame.getResultado_exame());
			statement.setInt(5, consultaExame.getId_paciente());
			
			statement.execute();
			statement.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
