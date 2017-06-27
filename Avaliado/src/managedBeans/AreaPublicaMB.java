package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dao.AvaliacaoDao;
import modelo.Avaliacao;

@ManagedBean
public class AreaPublicaMB {
	
	@EJB
	AvaliacaoDao avaliacaoDao;
	
	// Métodos de navegacao ============================================================================
	
	public ArrayList<Avaliacao> getTodasAsAvaliacoes() {
		return avaliacaoDao.getAll();
	}
	
	public String voltar() {
		
		return "landingPage";
	}

}
