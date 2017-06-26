package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import ejb.AvaliacaoEjb;
import ejb.LoginEjb;
import modelo.*;

@ManagedBean
public class AvaliacaoMB {
	
	@ManagedProperty(value="#{landingPageMB.loginEjb}")
	LoginEjb loginEjb;
	@ManagedProperty(value="#{selecaoMB.avaliacaoEjb}")
	AvaliacaoEjb avaliacaoEjb;
	
	public LoginEjb getLoginEjb() {
		return loginEjb;
	}

	public void setLoginEjb(LoginEjb loginEjb) {
		this.loginEjb = loginEjb;
	}

	public AvaliacaoEjb getAvaliacaoEjb() {
		return avaliacaoEjb;
	}

	public void setAvaliacaoEjb(AvaliacaoEjb avaliacaoEjb) {
		this.avaliacaoEjb = avaliacaoEjb;
	}
	
	public String getNomeDoProfessorSendoAvaliado() {
				
		Professor professor = (Professor)avaliacaoEjb.getItemSendoAvaliado();
		
		return professor.getNome();
	}
	
	public String getNomeDaDisciplinaSendoAvaliada() {
		
		Disciplina disciplina = (Disciplina)avaliacaoEjb.getItemSendoAvaliado();
		
		return disciplina.getNome();
	}
	
	public String getNomeDoCursoSendoAvaliado() {
		
		Curso curso = (Curso)avaliacaoEjb.getItemSendoAvaliado();
		
		return curso.getNome();
	}
	
	public String getNomeDaUniversidadeSendoAvaliada() {
		
		Universidade universidade = (Universidade)avaliacaoEjb.getItemSendoAvaliado();
		
		return universidade.getNome();
	}
	
	// Navegacao =================================================

	public String logout() {

		return "landingPage";
	}
	
	public String consolidarAvaliacao() {
		
		return "landingPage";
	}
}
