package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TelaDeGerenciaMB {
	
	// Métodos de navegacao ============================================================================
	
	public String voltar() {
		
		return "landingPage";
	}

}
