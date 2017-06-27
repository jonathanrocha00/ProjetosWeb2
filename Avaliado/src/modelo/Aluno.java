package modelo;

//import javax.persistence.Entity;

// @Entity
public class Aluno extends Pessoa{

	private int periodo;
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno() {
		super();
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo (int periodo) {
		this.periodo = periodo;
	}
}
