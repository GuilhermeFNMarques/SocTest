package dto;

//Data transfer object

public class Consultaexame {
	private int id_paciente;
	private String nome_paciente;
	private String nome_exame;
	private String data_exame;
	private String resultado_exame;
	
	
	public int getId_paciente() {
		return id_paciente;
	}
	
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	
	public String getNome_paciente() {
		return nome_paciente;
	}
	public void setNome_paciente(String nome_paciente) {
		this.nome_paciente = nome_paciente;
	}
	public String getNome_exame() {
		return nome_exame;
	}
	public void setNome_exame(String nome_exame) {
		this.nome_exame = nome_exame;
	}
	public String getData_exame() {
		return data_exame;
	}
	public void setData_exame(String data_exame) {
		this.data_exame = data_exame;
	}
	public String getResultado_exame() {
		return resultado_exame;
	}
	public void setResultado_exame(String resultado_exame) {
		this.resultado_exame = resultado_exame;
	}
	
	public String toString() {
		return getId_paciente() + " " + getNome_paciente() + " " + getNome_exame() + " " + getData_exame() + " " + getResultado_exame();
	}
	
}
