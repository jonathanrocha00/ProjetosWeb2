package managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import dao.AvaliacaoDao;
import ejb.AvaliacaoEjb;
import ejb.LoginEjb;
import modelo.*;

@ManagedBean
public class AvaliacaoMB {
	
	@EJB
	AvaliacaoDao avaliacaoDao;
	@ManagedProperty(value="#{landingPageMB.loginEjb}")
	LoginEjb loginEjb;
	@ManagedProperty(value="#{selecaoMB.avaliacaoEjb}")
	AvaliacaoEjb avaliacaoEjb;
	private int notaCriterio1;
	private int notaCriterio2;
	private int notaCriterio3;
	private String comentario;
	
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
	
	public String getNomeDoItemSendoAvaliado() {
		return avaliacaoEjb.getItemSendoAvaliado().getNome();
	}
	
	public String getCriterio1() {
		return avaliacaoEjb.getItemSendoAvaliado().getCriterios().get(0);
	}
	
	public String getCriterio2() {
		return avaliacaoEjb.getItemSendoAvaliado().getCriterios().get(1);
	}
	
	public String getCriterio3() {
		return avaliacaoEjb.getItemSendoAvaliado().getCriterios().get(2);
	}
	
	public int getNotaCriterio1() {
		return notaCriterio1;
	}

	public void setNotaCriterio1(int notaCriterio1) {
		this.notaCriterio1 = notaCriterio1;
	}

	public int getNotaCriterio2() {
		return notaCriterio2;
	}

	public void setNotaCriterio2(int notaCriterio2) {
		this.notaCriterio2 = notaCriterio2;
	}

	public int getNotaCriterio3() {
		return notaCriterio3;
	}

	public void setNotaCriterio3(int notaCriterio3) {
		this.notaCriterio3 = notaCriterio3;
	}
	
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	// Navegacao =================================================

	public String logout() {

		return "landingPage";
	}
	
	public String voltarParaSelecaoProfessor() {
		
		avaliacaoEjb.setItemSendoAvaliado(null);
		
		return "selecaoProfessor";
	}
	
	public String voltarParaSelecaoDisciplina() {
		
		avaliacaoEjb.setItemSendoAvaliado(null);
		
		return "selecaoDisciplina";
	}
	
	public String voltarParaSelecaoCurso() {
		
		avaliacaoEjb.setItemSendoAvaliado(null);
		
		return "selecaoCurso";
	}
	
	public String voltarParaSelecaoUniversidade() {
		
		avaliacaoEjb.setItemSendoAvaliado(null);
		
		return "selecaoUniversidade";
	}
	
	public String consolidarAvaliacao() {
		
		Avaliacao avaliacao = new Avaliacao();
		
		avaliacao.setUsuarioQueAvaliou(loginEjb.getPessoaLogada());
		avaliacao.setItemAvaliado(avaliacaoEjb.getItemSendoAvaliado());
		avaliacao.setNota1(notaCriterio1);
		avaliacao.setNota2(notaCriterio2);
		avaliacao.setNota3(notaCriterio3);
		avaliacao.setComentario(comentario);
		
		boolean podeAvaliar = avaliacaoEjb.validarAvaliacao(avaliacao);
		
		if (podeAvaliar) {
			avaliacaoDao.inserir(avaliacao);
			
			avaliacaoEjb.setItemSendoAvaliado(null);
			
			if (loginEjb.getPessoaLogada().getClass() == Professor.class) {
				return "homeProfessor";
			} else if (loginEjb.getPessoaLogada().getClass() == Aluno.class) {
				return "homeAluno";
			} else {
				return "landingPage";
			}
		} else {
			avaliacaoEjb.setItemSendoAvaliado(null);
			
			return "errorPage";
		}
		
		
		
		
		
		
	}
}
