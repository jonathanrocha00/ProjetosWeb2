package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dao.AlunoDao;
import modelo.Aluno;

@ManagedBean
public class CadastrarAlunoMBean {
	
	private Aluno aluno;
	@EJB
	private AlunoDao alunoDao;
	private int idADeletar;
	
	public CadastrarAlunoMBean() {
		aluno = new Aluno();
	}
	
	public void cadastrar() {
		alunoDao.inserir(aluno);
		
		aluno = new Aluno();
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ArrayList<Aluno> getAlunosLista() {
		
		return alunoDao.getAll();
	}
	
	public int getIdADeletar() {
		return idADeletar;
	}

	public void setIdADeletar(int idADeletar) {
		this.idADeletar = idADeletar;
	}
	
	public void deletar() {
		ArrayList<Aluno> tudo = alunoDao.getAll();
		
		for (Aluno aluno : tudo) {
			if (aluno.getId() == idADeletar) {
				alunoDao.remover(aluno);
				break;
			}
		}
	}
}
