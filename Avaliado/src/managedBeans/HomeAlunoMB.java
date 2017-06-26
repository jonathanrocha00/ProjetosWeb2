package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import ejb.LoginEjb;

@ManagedBean
public class HomeAlunoMB {

	@ManagedProperty(value="#{landingPageMB.loginEjb}")
	LoginEjb loginEjb;
	
	public LoginEjb getLoginEjb() {
		return loginEjb;
	}

	public void setLoginEjb(LoginEjb loginEjb) {
		this.loginEjb = loginEjb;
	}
	
	public String getNomeDoAlunoLogado() {
		
		return loginEjb.getPessoaLogada().getNome();
	}
		
	// Navegacao =================================================

	public String avaliarProfessores() {

		return "selecaoProfessor";
	}

	public String avaliarDisciplinas() {

		return "selecaoDisciplina";
	}

	public String avaliarCursos() {

		return "selecaoCurso";
	}

	public String avaliarUniversidades() {

		return "selecaoUniversidade";
	}

	public String logout() {
		
		loginEjb.setPessoaLogada(null);

		return "landingPage";
	}

}
