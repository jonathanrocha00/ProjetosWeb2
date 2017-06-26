package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Professor;

@Singleton
public class ProfessorDao {

	private ArrayList<Professor> listaProfessores;

	public ProfessorDao() {
		listaProfessores = new ArrayList<Professor>();
		
		Professor professor1 = new Professor();
		professor1.setNome("Joao");
		Professor professor2 = new Professor();
		professor2.setNome("Maria");
		Professor professor3 = new Professor();
		professor3.setNome("Joana");
		
		listaProfessores.add(professor1);
		listaProfessores.add(professor2);
		listaProfessores.add(professor3);
	}
	
	public ArrayList<Professor> getAll() {
		return listaProfessores;
	}
	
	public boolean inserir(Professor novoProfessor) {
		listaProfessores.add(novoProfessor);
		return true;
	}
	
	public boolean remover(Professor professor) {
		listaProfessores.remove(professor);
		return true;
	}

}
