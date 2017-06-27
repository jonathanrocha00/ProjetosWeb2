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
		universidade1.setNome("Universidade Federal do Rio Grande do Norte");
		universidade1.setSigla("UFRN");
		universidade1.setEndereco("Ali do lado do Via Direta");
		
		Universidade universidade2 = new Universidade();
		universidade2.setNome("Universidade Estadual do Rio Grande do Norte");
		universidade2.setSigla("UERN");
		universidade2.setEndereco("Avenida Ayrton Senna");
		
		Universidade universidade3 = new Universidade();
		universidade3.setNome("Universidade Particular da vida");
		universidade3.setSigla("UPV");
		universidade3.setEndereco("Do lado do Midway");
		
		listaUniversidades.add(universidade1);
		listaUniversidades.add(universidade2);
		listaUniversidades.add(universidade3);
	}
	
	public ArrayList<Universidade> getAll() {
		return listaUniversidades;
	}
	
	public Universidade search(int id) {
		for (Universidade universidade : listaUniversidades) {
			if (universidade.getId() == id) {
				return universidade;
			}
		}
		
		return null;
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
