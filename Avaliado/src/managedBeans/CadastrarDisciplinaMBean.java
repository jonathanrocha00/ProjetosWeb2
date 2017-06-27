package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dao.DisciplinaDao;
import modelo.Disciplina;

@ManagedBean
public class CadastrarDisciplinaMBean {

	private Disciplina disciplina;
	@EJB
	private DisciplinaDao disciplinaDao;
	private int idADeletar;
	
	public CadastrarDisciplinaMBean() {
		disciplina = new Disciplina();
	}
	
	public void cadastrar() {
		disciplinaDao.inserir(disciplina);
		
		disciplina = new Disciplina();
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Disciplina> getDisciplinasLista() {
		return disciplinaDao.getAll();
	}

	public int getIdADeletar() {
		return idADeletar;
	}

	public void setIdADeletar(int idADeletar) {
		this.idADeletar = idADeletar;
	}
	
	public void deletar() {
		ArrayList<Disciplina> tudo = disciplinaDao.getAll();
		
		for (Disciplina disciplina : tudo) {
			if (disciplina.getId() == idADeletar) {
				disciplinaDao.remover(disciplina);
				break;
			}
		}
	}

}
