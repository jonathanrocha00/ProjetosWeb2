package modelo;

import java.util.ArrayList;

public class Curso {

	private int id;
	private String nome;
	private String universidade;
	private ArrayList<String> criterios;
	
	static int currentId = 0;
	
	public Curso() {
		criterios = new ArrayList<String>();
		criterios.add("flexiblidade");
		criterios.add("dificuldade");
		criterios.add("situação do mercado de trabalho");
		
		id = currentId;
		currentId++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUniversidade(){
		return universidade;
	}
	
	public void setUniversidade(String universidade){
		this.universidade = universidade;
	}
}
