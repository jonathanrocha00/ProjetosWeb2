package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AreaPublicaMB {
	
	// M�todos de navegacao ============================================================================
	
	public String voltar() {
		
		return "landingPage";
	}

}
