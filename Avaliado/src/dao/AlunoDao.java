package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Aluno;

@Singleton
public class AlunoDao {
	
	private ArrayList<Aluno> listaAlunos;
	
	public AlunoDao() {
		listaAlunos = new ArrayList<Aluno>();
	}
	
	public ArrayList<Aluno> getAll() {
		return listaAlunos;
	}
	
	public void inserir(Aluno novoAluno) {
		listaAlunos.add(novoAluno);
	}
	
	public boolean remover(Aluno aluno) {
		listaAlunos.remove(aluno);
		return true;
	}

}
