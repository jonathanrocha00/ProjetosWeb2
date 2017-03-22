package modelo;

import java.util.ArrayList;

public class Departamento {
	
	// Atributos
	private String nome;
	private Chefe chefe;
	private ArrayList<Funcionario> funcionarios;
	
	// Metodos
	public Departamento(String nome) {
		this.nome = nome;
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public boolean adicionarFuncionario(Funcionario f) {
		if (funcionarios.contains(f)) {
			return false;
		}
		
		funcionarios.add(f);
		if (f.getLotacao() != this) {
			f.setLotacao(this);
		}
		return true;
	}
	public boolean removerFuncionario(Funcionario f) {
		if (!funcionarios.contains(f)) {
			return false;
		}
		
		funcionarios.remove(f);
		f.setLotacao(null);
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Chefe getChefe() {
		return chefe;
	}
	public void setChefe(Chefe chefe) {
		
		// TODO
	}
	
	// Para debugar
	public void print() {
		System.out.print("DPTO - nome: " + nome + " chefe: ");
		if (chefe != null) {
			System.out.println(chefe.getNome());
		}
		else {
			System.out.println("null");
		}
		
		System.out.println("    Lista de funcionarios:");
		if (funcionarios.size() == 0) {
			System.out.println("    Vazia");
		}
		else {
			for(Funcionario f : funcionarios) {
				System.out.print("    ");
				f.print();
			}
		}
	}
}
