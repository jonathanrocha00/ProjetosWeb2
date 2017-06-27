package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Aluno;

@Singleton
public class AlunoDao {
	
	private ArrayList<Aluno> listaAlunos;
	
	public AlunoDao() {
		listaAlunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Victor");
		aluno1.setInstituicao("Universidade Federal do Rio Grande do Norte");
		aluno1.setPeriodo(10);
		aluno1.setCurso("BTI");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Teresa");
		aluno2.setInstituicao("Universidade Federal do Rio Grande do Norte");
		aluno2.setPeriodo(1);
		aluno2.setCurso("CET");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Clare");
		aluno3.setInstituicao("Universidade Particular da vida");
		aluno3.setPeriodo(3);
		aluno3.setCurso("Letras");		
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
	}
	
	public ArrayList<Aluno> getAll() {
		return listaAlunos;
	}
	
	public Aluno search(int id) {
		for (Aluno aluno : listaAlunos) {
			if (aluno.getId() == id) {
				return aluno;
			}
		}
		
		return null;
	}
	
	public void inserir(Aluno novoAluno) {
		listaAlunos.add(novoAluno);
	}
	
	public boolean remover(Aluno aluno) {
		listaAlunos.remove(aluno);
		return true;
	}

}
