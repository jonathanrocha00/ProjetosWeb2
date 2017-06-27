package managedBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dao.UniversidadeDao;
import modelo.Universidade;

@ManagedBean
public class CadastrarUniversidadeMBean {

	private Universidade universidade;
	@EJB
	private UniversidadeDao universidadeDao;
	private int idADeletar;
	
	public CadastrarUniversidadeMBean() {
		universidade = new Universidade();
	}
	
	public void cadastrar() {
		universidadeDao.inserir(universidade);
		
		universidade = new Universidade();
	}
	
	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

	public ArrayList<Universidade> getUniversidadesLista() {
		return universidadeDao.getAll();
	}

	public int getIdADeletar() {
		return idADeletar;
	}

	public void setIdADeletar(int idADeletar) {
		this.idADeletar = idADeletar;
	}
	
	public void deletar() {
		ArrayList<Universidade> tudo = universidadeDao.getAll();
		
		for (Universidade universidade : tudo) {
			if (universidade.getId() == idADeletar) {
				universidadeDao.remover(universidade);
				break;
			}
		}
	}

}
