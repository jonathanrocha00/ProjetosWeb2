package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dao.ProfessorDao;
import modelo.Professor;

@ManagedBean
public class CadastrarProfessorMBean {

	private Professor professor;
	@EJB
	private ProfessorDao professorDao;
	private int idADeletar;
	
	public CadastrarProfessorMBean() {
		professor = new Professor();
	}
	
	public void cadastrar() {
		professorDao.inserir(professor);
		
		professor = new Professor();
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Professor> getProfessoresLista() {
		return professorDao.getAll();
	}

	public int getIdADeletar() {
		return idADeletar;
	}

	public void setIdADeletar(int idADeletar) {
		this.idADeletar = idADeletar;
	}
	
	public void deletar() {
		ArrayList<Professor> tudo = professorDao.getAll();
		
		for (Professor professor : tudo) {
			if (professor.getId() == idADeletar) {
				professorDao.remover(professor);
				break;
			}
		}
	}

}
