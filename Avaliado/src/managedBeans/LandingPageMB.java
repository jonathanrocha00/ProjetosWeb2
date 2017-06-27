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
	
	public String logarComoAlunoVictor() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Victor");
		
		loginEjb.setPessoaLogada(aluno);
		
		return "homeAluno";
	}
	public String logarComoAlunaTeresa() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Teresa");
		
		loginEjb.setPessoaLogada(aluno);
		
		return "homeAluno";
	}
	public String logarComoAlunaClare() {
	
		Aluno aluno = new Aluno();
		aluno.setNome("Clare");
		
		loginEjb.setPessoaLogada(aluno);
		
		return "homeAluno";
	}

	public String logarComoProfessoraPaula() {
		
		Professor professor = new Professor();
		professor.setNome("Paula");
		
		loginEjb.setPessoaLogada(professor);
		
		return "homeProfessor";
	}
	public String logarComoProfessoraMaria() {
		
		Professor professor = new Professor();
		professor.setNome("Maria");
		
		loginEjb.setPessoaLogada(professor);
		
		return "homeProfessor";
	}
	public String logarComoProfessorJoao() {
		
		Professor professor = new Professor();
		professor.setNome("Joao");
		
		loginEjb.setPessoaLogada(professor);
		
		return "homeProfessor";
	}

	public String irParaAreaPublica() {
	
		return "areaPublica";
	}

}
