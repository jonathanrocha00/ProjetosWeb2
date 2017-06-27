package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import dao.AvaliacaoDao;
import ejb.LoginEjb;
import modelo.Avaliacao;
import modelo.Professor;

@ManagedBean
public class HomeProfessorMB {
	
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
	
	public String getNomeDoProfessorLogado() {
		
		return loginEjb.getPessoaLogada().getNome();
	}
	
	// Navegacao =================================================

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
	
	public ArrayList<Avaliacao> getAvaliacoesRecebidasPelaPessoaLogada() {
		
		ArrayList<Avaliacao> avaliacoesRecebidasPelaPessoaLogada = new ArrayList<Avaliacao>();
		ArrayList<Avaliacao> todasAsAvalicaoes = avaliacaoDao.getAll();
		
		for (Avaliacao avaliacao : todasAsAvalicaoes) {
			
			if (avaliacao.getItemAvaliado().getId() == loginEjb.getPessoaLogada().getId()) {
				avaliacoesRecebidasPelaPessoaLogada.add(avaliacao);
			}
		}
				
		return avaliacoesRecebidasPelaPessoaLogada;
		
	}
	
	public String getInformacoesDoProfessor() {
		Professor professor = (Professor)loginEjb.getPessoaLogada();
		
		return "Instituicao: " + professor.getInstituicao();
	}
	
	public String logout() {
		
		loginEjb.setPessoaLogada(null);

		return "landingPage";
	}
	
}
