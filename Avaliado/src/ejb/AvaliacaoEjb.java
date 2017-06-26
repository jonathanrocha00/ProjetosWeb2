package ejb;

import javax.ejb.Stateful;

@Stateful
public class AvaliacaoEjb {
	
	private Object itemSendoAvaliado;

	public Object getItemSendoAvaliado() {
		return itemSendoAvaliado;
	}

	public void setItemSendoAvaliado(Object itemSendoAvaliado) {
		this.itemSendoAvaliado = itemSendoAvaliado;
	}

}
