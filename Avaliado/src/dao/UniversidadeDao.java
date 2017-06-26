package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Universidade;

@Singleton
public class UniversidadeDao {

	private ArrayList<Universidade> listaUniversidades;
	
	public UniversidadeDao() {
		listaUniversidades = new ArrayList<Universidade>();
		
		Universidade universidade1 = new Universidade();
		universidade1.setNome("Universidade Federal do RN");
		
		Universidade universidade2 = new Universidade();
		universidade2.setNome("Universidade Estadual do RN");
		
		Universidade universidade3 = new Universidade();
		universidade3.setNome("Universidade Particular da vida");
		
		listaUniversidades.add(universidade1);
		listaUniversidades.add(universidade2);
		listaUniversidades.add(universidade3);
	}
	
	public ArrayList<Universidade> getAll() {
		return listaUniversidades;
	}
	
	public boolean inserir(Universidade novaUniversidade) {
		listaUniversidades.add(novaUniversidade);
		return true;
	}
	
	public boolean remover(Universidade universidade) {
		listaUniversidades.remove(universidade);
		return true;
	}

}
