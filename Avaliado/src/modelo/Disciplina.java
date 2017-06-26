package modelo;

import java.util.ArrayList;

public class Disciplina {

	private int id;
	private String nome;
	private String professor;
	private int periodo;
	private ArrayList<String> criterios;
	
	static int currentId = 0;
	
	public Disciplina() {
		criterios = new ArrayList<String>();
		criterios.add("dificuldade");
		criterios.add("cobranca");
		criterios.add("relevancia");
		
		id = currentId;
		currentId++;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfessor(){
		return professor;
	}
	
	public void setProfessor(String professor){
		this.professor = professor;
	}
	
	public int getPeriodo(){
		return periodo;
	}
	
	public void setPeriodo(int periodo){
		this.periodo = periodo;
	}
		
}
