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
		professor1.setInstituicao("Universidade Federal do Rio Grande do Norte");
		
		Professor professor2 = new Professor();
		professor2.setNome("Maria");
		professor2.setInstituicao("Universidade Particular da vida");
		
		Professor professor3 = new Professor();
		professor3.setNome("Paula");
		professor3.setInstituicao("Universidade Federal do Rio Grande do Norte");
		
		listaProfessores.add(professor1);
		listaProfessores.add(professor2);
		listaProfessores.add(professor3);
	}
	
	public ArrayList<Professor> getAll() {
		return listaProfessores;
	}
	
	public Professor search(int id) {
		for (Professor professor : listaProfessores) {
			if (professor.getId() == id) {
				return professor;
			}
		}
		
		return null;
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
