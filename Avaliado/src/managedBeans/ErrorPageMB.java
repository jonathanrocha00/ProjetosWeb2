package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ErrorPageMB {
	
	public String voltar() {
		return "landingPage";

	}
}
