package ejb;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import dao.AlunoDao;
import dao.ProfessorDao;
import modelo.Aluno;
import modelo.Pessoa;
import modelo.Professor;

@Stateful
public class LoginEjb {

	private Pessoa pessoaLogada;
	@EJB
	AlunoDao alunoDao;
	@EJB
	ProfessorDao professorDao;
	
	public Pessoa getPessoaLogada() {
		return pessoaLogada;
	}

	public void setPessoaLogada(Pessoa pessoaLogada) {
		
		boolean flagAchouPessoa = false;
		
		if (pessoaLogada == null) {
			this.pessoaLogada = null;
			flagAchouPessoa = true;
		}
		
		if (!flagAchouPessoa) {
			ArrayList<Aluno> todosOsAlunos = alunoDao.getAll();
			for (Aluno aluno : todosOsAlunos) {
				if (aluno.getNome().equals(pessoaLogada.getNome())) {
					this.pessoaLogada = aluno;
					flagAchouPessoa = true;
					
					break;
				}
			}
		}
		
		if (!flagAchouPessoa) {
			ArrayList<Professor> todosOsProfessores = professorDao.getAll();
			for (Professor professor : todosOsProfessores) {
				if (professor.getNome().equals(pessoaLogada.getNome())) {
					this.pessoaLogada = professor;
					flagAchouPessoa = true;
					
					break;
				}
			}
		}
		
	}
}
