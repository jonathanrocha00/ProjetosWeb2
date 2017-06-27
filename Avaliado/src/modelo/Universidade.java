package modelo;

import java.util.ArrayList;

//import javax.persistence.Entity;

// @Entity
public class Universidade implements ItemAvaliavel {
	
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String sigla;
	private String endereco;
	private ArrayList<String> criterios;
	
	static int currentId = 0;
	
	public Universidade() {
		criterios = new ArrayList<String>();
		criterios.add("estrutura");
		criterios.add("vida cultural");
		criterios.add("auxilios");
		
		id = currentId;
		currentId++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<String> getCriterios() {
		return criterios;
	}

	public void setCriterios(ArrayList<String> criterios) {
		this.criterios = criterios;
	}

	
}
