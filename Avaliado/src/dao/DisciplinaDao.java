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
		disciplina1.setNome("Web II");
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("LP II");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("FMC");
		
		listaDisciplinas.add(disciplina1);
		listaDisciplinas.add(disciplina2);
		listaDisciplinas.add(disciplina3);
	}
	
	public ArrayList<Disciplina> getAll() {
		return listaDisciplinas;
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
