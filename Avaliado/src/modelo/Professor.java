package modelo;

import java.util.ArrayList;

public class Professor extends Pessoa{

	private ArrayList<String> criterios;

	public Professor(){
		super();
		
		criterios = new ArrayList<String>();
		criterios.add("elaboracao de provas");
		criterios.add("metodologia");
		criterios.add("personalidade");
	}

	public ArrayList<String> getCriterios() {
		return criterios;
	}

	public void setCriterios(ArrayList<String> criterios) {
		this.criterios = criterios;
	}

}

