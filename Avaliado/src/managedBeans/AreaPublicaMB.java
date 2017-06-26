package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AreaPublicaMB {
	
	// Métodos de navegacao ============================================================================
	
	public String voltar() {
		
		return "landingPage";
	}

}
