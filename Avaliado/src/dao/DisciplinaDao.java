package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Disciplina;

@Singleton
public class DisciplinaDao {

	private ArrayList<Disciplina> listaDisciplinas;
	
	public DisciplinaDao() {
		listaDisciplinas = new ArrayList<Disciplina>();
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("ITP");
		disciplina1.setProfessor("Tiago");
		disciplina1.setPeriodo(1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("LP II");
		disciplina2.setProfessor("Larissa");
		disciplina2.setPeriodo(3);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("FMC");
		disciplina3.setProfessor("Satanas");
		disciplina3.setPeriodo(4);
		
		listaDisciplinas.add(disciplina1);
		listaDisciplinas.add(disciplina2);
		listaDisciplinas.add(disciplina3);
	}
	
	public ArrayList<Disciplina> getAll() {
		return listaDisciplinas;
	}
	
	public Disciplina search(int id) {
		for (Disciplina disciplina : listaDisciplinas) {
			if (disciplina.getId() == id) {
				return disciplina;
			}
		}
		
		return null;
	}
	
	public boolean inserir(Disciplina novaDisciplina) {
		listaDisciplinas.add(novaDisciplina);
		return true;
	}
	
	public boolean remover(Disciplina disciplina) {
		listaDisciplinas.remove(disciplina);
		return true;
	}
}
