package ejb;

import javax.ejb.Stateful;

import modelo.Aluno;
import modelo.Avaliacao;
import modelo.Disciplina;
import modelo.ItemAvaliavel;
import modelo.Professor;
import modelo.Universidade;

@Stateful
public class AvaliacaoEjb {
	
	private ItemAvaliavel itemSendoAvaliado;

	public ItemAvaliavel getItemSendoAvaliado() {
		return itemSendoAvaliado;
	}

	public void setItemSendoAvaliado(ItemAvaliavel itemSendoAvaliado) {
		this.itemSendoAvaliado = itemSendoAvaliado;
	}
	
	public boolean validarAvaliacao(Avaliacao avaliacao) {
		
		// Checagens caso o usuario que avaliou seja aluno
		if (avaliacao.getUsuarioQueAvaliou().getClass() == Aluno.class) {
			Aluno aluno = (Aluno)avaliacao.getUsuarioQueAvaliou();
			
			// Caso o item avaliado seja um professor
			if (avaliacao.getItemAvaliado().getClass() == Professor.class) {
				Professor professor = (Professor)avaliacao.getItemAvaliado();
				
				// Se a instituicao do aluno for diferente da do professor ele não pode avaliar
				if (!aluno.getInstituicao().equals(professor.getInstituicao())) {
					return false;
				}
			}
			
			// Caso o item avaliado seja uma disciplina
			if (avaliacao.getItemAvaliado().getClass() == Disciplina.class) {
				Disciplina disciplina = (Disciplina)avaliacao.getItemAvaliado();
				
				// Se o periodo do aluno for menor que o periodo em que a disciplina deve ser cursada ele não pode avaliar
				if (aluno.getPeriodo() < disciplina.getPeriodo()) {
					return false;
				}
			}
			
			// Caso o item avaliado seja uma universidade
			if (avaliacao.getItemAvaliado().getClass() == Universidade.class) {
				Universidade universidade = (Universidade)avaliacao.getItemAvaliado();

				// Se o periodo do aluno for menor que o periodo em que a disciplina deve ser cursada ele não pode avaliar
				if (!aluno.getInstituicao().equals(universidade.getNome())) {
					return false;
				}
			}
		}
		
		return true;
	}

}
