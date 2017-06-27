package dao;

import java.util.ArrayList;

import javax.ejb.Singleton;

import modelo.Avaliacao;

@Singleton
public class AvaliacaoDao {
	
	private ArrayList<Avaliacao> listaAvaliacoes;
	
	public AvaliacaoDao() {
		listaAvaliacoes = new ArrayList<Avaliacao>();
	}
	
	public ArrayList<Avaliacao> getAll() {
		return listaAvaliacoes;
	}
	
	public Avaliacao search(int id) {
		for (Avaliacao avaliacao : listaAvaliacoes) {
			if (avaliacao.getId() == id) {
				return avaliacao;
			}
		}
		
		return null;
	}
	
	public void inserir(Avaliacao novaAvaliacao) {		
		listaAvaliacoes.add(novaAvaliacao);
	}
	
	public boolean remover(Avaliacao avaliacao) {
		listaAvaliacoes.remove(avaliacao);
		return true;
	}
}
