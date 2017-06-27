package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import dao.AvaliacaoDao;
import ejb.LoginEjb;
import modelo.Aluno;
import modelo.Avaliacao;

@ManagedBean
public class HomeAlunoMB {
	
	@EJB
	AvaliacaoDao avaliacaoDao;
	
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
	
	public ArrayList<Avaliacao> getAvaliacoesFeitasPelaPessoaLogada() {
		
		ArrayList<Avaliacao> avaliacoesFeitasPelaPessoaLogada = new ArrayList<Avaliacao>();
		ArrayList<Avaliacao> todasAsAvalicaoes = avaliacaoDao.getAll();
		
		for (Avaliacao avaliacao : todasAsAvalicaoes) {
			
			if (avaliacao.getUsuarioQueAvaliou().getId() == loginEjb.getPessoaLogada().getId()) {
				avaliacoesFeitasPelaPessoaLogada.add(avaliacao);
			}
		}
				
		return avaliacoesFeitasPelaPessoaLogada;		
	}
	
	public String getInformacoesDoAluno() {
		
		Aluno aluno = (Aluno)loginEjb.getPessoaLogada();
		
		return "Curso: " + aluno.getCurso() + " | Periodo:" + aluno.getPeriodo() + " | Instituicao: " + aluno.getInstituicao();
	}

	public String logout() {
		
		loginEjb.setPessoaLogada(null);

		return "landingPage";
	}

}
