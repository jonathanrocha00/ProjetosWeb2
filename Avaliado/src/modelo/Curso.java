package modelo;

import java.util.ArrayList;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

// @Entity
public class Curso implements ItemAvaliavel {

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	public ArrayList<String> getCriterios() {
		return criterios;
	}

	public void setCriterios(ArrayList<String> criterios) {
		this.criterios = criterios;
	}
}
