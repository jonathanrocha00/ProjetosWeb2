package modelo;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;

// @Entity
public class Avaliacao {
	
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	// @OneToOne
	private Pessoa usuarioQueAvaliou;
	private ItemAvaliavel itemAvaliado;
	private int nota1;
	private int nota2;
	private int nota3;
	private String comentario;
	
	static int currentId = 0;
	
	public Avaliacao() {
		id = currentId;
		currentId++;
	}
	
	public Pessoa getUsuarioQueAvaliou() {
		return usuarioQueAvaliou;
	}
	public void setUsuarioQueAvaliou(Pessoa usuarioQueAvaliou) {
		this.usuarioQueAvaliou = usuarioQueAvaliou;
	}
	public ItemAvaliavel getItemAvaliado() {
		return itemAvaliado;
	}
	public void setItemAvaliado(ItemAvaliavel itemAvaliado) {
		this.itemAvaliado = itemAvaliado;
	}
	public String getNomeItemAvaliado() {
		return itemAvaliado.getNome();
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
