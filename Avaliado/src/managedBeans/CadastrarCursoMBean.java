package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dao.CursoDao;
import modelo.Curso;

@ManagedBean
public class CadastrarCursoMBean {

	private Curso curso;
	@EJB
	private CursoDao cursoDao;
	private int idADeletar;

	public CadastrarCursoMBean() {
		curso = new Curso();
	}
	
	public void cadastrar() {
		cursoDao.inserir(curso);
		
		curso = new Curso();
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public ArrayList<Curso> getCursosLista() {
		return cursoDao.getAll();
	}
	
	public int getIdADeletar() {
		return idADeletar;
	}

	public void setIdADeletar(int idADeletar) {
		this.idADeletar = idADeletar;
	}
	
	public void deletar() {
		ArrayList<Curso> tudo = cursoDao.getAll();
		
		for (Curso curso : tudo) {
			if (curso.getId() == idADeletar) {
				cursoDao.remover(curso);
				break;
			}
		}
	}

}
