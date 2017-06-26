package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import ejb.LoginEjb;
import modelo.Aluno;
import modelo.Professor;

@ManagedBean
@SessionScoped
public class LandingPageMB {
	
	@Inject
	LoginEjb loginEjb;
	
	public LoginEjb getLoginEjb() {
		return loginEjb;
	}

	public void setLoginEjb(LoginEjb loginEjb) {
		this.loginEjb = loginEjb;
	}

	// Métodos de navegacao ============================================================================
	public String irParaTelaDeGerencia() {
		
		return "telaDeGerencia";
	}
	
	public String logarComoAluno() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Victor");
		aluno.setPeriodo(4);
		aluno.setInstituicao("Universidade Federal do RN");
		
		loginEjb.setPessoaLogada(aluno);
		
		return "homeAluno";
	}

	public String logarComoProfessor() {
		
		Professor professor = new Professor();
		professor.setNome("Paula");
		professor.setInstituicao("Universidade Federal do RN");
		
		loginEjb.setPessoaLogada(professor);
		
		return "homeProfessor";
	}

	public String irParaAreaPublica() {
	
		return "areaPublica";
	}

}
