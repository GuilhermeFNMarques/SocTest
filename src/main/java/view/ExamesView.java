package view;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.MConsultaexames;
import dto.Consultaexame;

//ACTION DO LISTAR

public class ExamesView extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Consultaexame consultaExame;
	private List<Consultaexame> retorna;
	
	public String execute() {
		retorna = new MConsultaexames().listarExames();
		return "lista";
	}
	
	public List<Consultaexame> getRetorna() {
		return retorna;
	}
	
	public void setRetorna(List<Consultaexame> retorna) {
		this.retorna = retorna;
	}

	public Consultaexame getConsultaExame() {
		return consultaExame;
	}

	public void setConsultaExame(Consultaexame consultaExame) {
		this.consultaExame = consultaExame;
	}
	
	
}
