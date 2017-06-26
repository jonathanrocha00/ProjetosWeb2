package ejb;

import javax.ejb.Stateful;

import modelo.Pessoa;

@Stateful
public class LoginEjb {

	private Pessoa pessoaLogada;
	
	public Pessoa getPessoaLogada() {
		return pessoaLogada;
	}

	public void setPessoaLogada(Pessoa pessoaLogada) {
		this.pessoaLogada = pessoaLogada;
	}
}
