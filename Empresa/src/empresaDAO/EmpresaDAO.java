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
	public boolean editarFuncionario(Funcionario f, String nome, double salario, Departamento d ) {
		f.setNome(nome);
		f.setSalario(salario);
		f.setLotacao(d);
		
		return true;
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
	public boolean editarDepartamento(Departamento d, String nome, Chefe c) {
		d.setNome(nome);
		d.setChefe(c);
		
		return true;
	}
	
	// Chefes
	public boolean inserirChefe(Chefe c) {
		listaDeChefes.add(c);
		
		return true;
	}
	public boolean removerChefe(Chefe c) {
		listaDeChefes.remove(c);

		return true;
	}
	public boolean editarChefe(Chefe c, String nome, double salario, Departamento d, Departamento dChefiado) {
		c.setNome(nome);
		c.setSalario(salario);
		c.setLotacao(d);
		c.setDpto(dChefiado);
		
		return true;
	}
	
}
