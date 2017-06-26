package modelo;

public class Pessoa{
	
	private int id;
	private String nome;
	private String instituicao;
	
	static int currentId = 0;
	
	public Pessoa() {		
		id = currentId;
		currentId++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
}
