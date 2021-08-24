package view;

import com.opensymphony.xwork2.ActionSupport;

import dao.MConsultaexames;
import dto.Consultaexame;

public class AlterarView extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Consultaexame consultaExame;
	
	public String execute() {
		new MConsultaexames().atualizar(consultaExame);
		return "altera";
	}

	public Consultaexame getConsultaExame() {
		return consultaExame;
	}

	public void setConsultaExame(Consultaexame consultaExame) {
		this.consultaExame = consultaExame;
	}
	


}
