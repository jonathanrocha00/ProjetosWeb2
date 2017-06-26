package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Curso;

@Singleton
public class CursoDao {

	private ArrayList<Curso> listaCursos;
	
	public CursoDao() {
		listaCursos = new ArrayList<Curso>();
		
		Curso curso1 = new Curso();
		curso1.setNome("BTI");
		
		Curso curso2 = new Curso();
		curso2.setNome("CET");
		
		Curso curso3 = new Curso();
		curso3.setNome("Letras");
		
		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);
	}
	
	public ArrayList<Curso> getAll() {
		return listaCursos;
	}
	
	public void inserir(Curso novoCurso) {
		listaCursos.add(novoCurso);
	}
	
	public boolean remover(Curso curso) {
		listaCursos.remove(curso);
		return true;
	}
}
