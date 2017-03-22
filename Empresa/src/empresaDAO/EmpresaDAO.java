package empresaDAO;

import java.util.ArrayList;

import modelo.*;


public class EmpresaDAO {
	
	// Atributos
	private ArrayList<Funcionario> listaDeFuncionarios;
	private ArrayList<Departamento> listaDeDepartamentos;
	private ArrayList<Chefe> listaDeChefes;
	
	// Metodos
	// Funcionarios
	public boolean inserirFuncionario(Funcionario f) {
		listaDeFuncionarios.add(f);
		
		return true;
	}
	public boolean removerFuncionario(Funcionario f) {
		listaDeFuncionarios.remove(f);
		
		return true;
	}
	public boolean editarFuncionario() {
		return false;
	}
	
	// Departamentos
	public boolean inserirDepartamento(Departamento d) {
		listaDeDepartamentos.add(d);
		
		return true;
	}
	public boolean removerDepartamento(Departamento d) {
		listaDeDepartamentos.remove(d);
		
		return true;
	}
	public boolean editarDepartamento() {
		return false;
	}
	
	// Chefes
	public boolean inserirChefe(Chefe c) {
		// TODO
		
		return false;
	}
	public boolean removerChefe(Chefe c) {
		// TODO

		return false;
	}
	public boolean editarChefe() {
		return false;
	}
	
}
