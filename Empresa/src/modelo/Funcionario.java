package modelo;

public class Funcionario {
	
	// Atributos
	protected String nome;
	protected double salario;
	protected Departamento departamento;
	
	//Metodos
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Departamento getLotacao() {
		return departamento;
	}
	public void setLotacao(Departamento departamento) {
		
		if (this.departamento != null) {
			this.departamento.removerFuncionario(this);
		}
		
		this.departamento = departamento;
		
		if (departamento != null) {
			departamento.adicionarFuncionario(this);
		}
	}
	
	// Para debugar
	public void print() {
		System.out.print("FUNC - nome: " + nome + " sal: " + salario + " dpto: ");
		if (departamento != null) {
			System.out.println(departamento.getNome());
		}
		else {
			System.out.println("null");
		}
	}
}
