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
		
		// TODO
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
