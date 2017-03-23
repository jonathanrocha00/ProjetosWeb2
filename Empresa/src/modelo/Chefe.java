package modelo;

public class Chefe extends Funcionario {

	// Atributos
	private Departamento departamentoChefiado;
	
	// Metodos
	public Chefe(String nome, double salario) {
		super(nome, salario);
	}
	
	public Departamento getDpto() {
		return departamentoChefiado;
	}

	public void setDpto(Departamento dpto_) {
		
		if (this.departamentoChefiado == null && dpto_ == null) {
			return;
		}
		else if (this.departamentoChefiado == null && dpto_ != null) {
			this.departamentoChefiado = dpto_;
			this.departamentoChefiado.setChefe(this);
		}
		else if (this.departamentoChefiado != null && dpto_ != null) {
			
			if (this.departamentoChefiado == dpto_) {
				return;
			}
			else {
				this.departamentoChefiado.setChefe(null);
				this.departamentoChefiado = dpto_;
				this.departamentoChefiado.setChefe(this);
			}
		}
		else if (this.departamentoChefiado != null && dpto_ == null) {
			Departamento aux = this.departamentoChefiado;
			this.departamentoChefiado = null;
			aux.setChefe(null);
		}
	}
	
	// Para debugar
	public void print() {
		System.out.print("CHEFE - nome: " + nome + " sal: " + salario + " dpto: ");
		if (departamento != null) {
			System.out.print(departamento.getNome());
		}
		else {
			System.out.print("null");
		}
		System.out.print(" dptoChefiado: ");
		if (departamentoChefiado != null) {
			System.out.println(departamentoChefiado.getNome());
		}
		else {
			System.out.println("null");
		}
	}
}
