package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;

import dao.*;
import ejb.AvaliacaoEjb;
import ejb.LoginEjb;
import modelo.*;

@ManagedBean
public class SelecaoMB {

	@EJB
	ProfessorDao professorDao;
	@EJB
	DisciplinaDao disciplinaDao;
	@EJB
	CursoDao cursoDao;
	@EJB
	UniversidadeDao universidadeDao;
	@ManagedProperty(value="#{landingPageMB.loginEjb}")
	LoginEjb loginEjb;
	@Inject
	AvaliacaoEjb avaliacaoEjb;
	private int idDoItemSendoAvaliado;
	
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
	
	public int getIdDoItemSendoAvaliado() {
		return idDoItemSendoAvaliado;
	}

	public void setIdDoItemSendoAvaliado(int idDoItemSendoAvaliado) {
		this.idDoItemSendoAvaliado = idDoItemSendoAvaliado;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professorDao.getAll();
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinaDao.getAll();
	}
	
	public ArrayList<Curso> getCursos() {
		return cursoDao.getAll();
	}
	
	public ArrayList<Universidade> getUniversidades() {
		return universidadeDao.getAll();
	}
	
	
	// Navegacao =================================================

	public String voltar() {
		
		if (loginEjb.getPessoaLogada().getClass() == Professor.class) {
			return "homeProfessor";
		} else if (loginEjb.getPessoaLogada().getClass() == Aluno.class) {
			return "homeAluno";
		} else {
			return "landingPage";
		}
	}
	
	public String avaliarProfessor() {
		
		ArrayList<Professor> lista = professorDao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == idDoItemSendoAvaliado) {
				avaliacaoEjb.setItemSendoAvaliado(lista.get(i));
				return "avaliacaoProfessor";
			}
		}

		Professor professor = new Professor();
		professor.setNome("Padrão");
		avaliacaoEjb.setItemSendoAvaliado(professor);
		
		return "avaliacaoProfessor";
	}
	
	public String avaliarDisciplina() {

		ArrayList<Disciplina> lista = disciplinaDao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == idDoItemSendoAvaliado) {
				avaliacaoEjb.setItemSendoAvaliado(lista.get(i));
				return "avaliacaoDisciplina";
			}
		}

		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Padrão");
		avaliacaoEjb.setItemSendoAvaliado(disciplina);
		
		return "avaliacaoDisciplina";
	}
	
	public String avaliarCurso() {

		ArrayList<Curso> lista = cursoDao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == idDoItemSendoAvaliado) {
				avaliacaoEjb.setItemSendoAvaliado(lista.get(i));
				return "avaliacaoCurso";
			}
		}

		Curso curso = new Curso();
		curso.setNome("Padrão");
		avaliacaoEjb.setItemSendoAvaliado(curso);
		
		return "avaliacaoCurso";
	}
	public String avaliarUniversidade() {

		ArrayList<Universidade> lista = universidadeDao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == idDoItemSendoAvaliado) {
				avaliacaoEjb.setItemSendoAvaliado(lista.get(i));
				return "avaliacaoUniversidade";
			}
		}

		Universidade universidade = new Universidade();
		universidade.setNome("Padrão");
		avaliacaoEjb.setItemSendoAvaliado(universidade);
		
		return "avaliacaoUniversidade";
	}
}
