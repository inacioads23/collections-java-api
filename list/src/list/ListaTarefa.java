package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	// atributo
	// usando generics
	private List<Tarefa> tarefaList;

	/*
	 * // Construtor padrão public ListaTarefa(List<Tarefa> tarefaList) {
	 * this.tarefaList = tarefaList; }
	 */

	// Construtor personalizado
	public ListaTarefa() {
		this.tarefaList = new ArrayList<Tarefa>();
	}

	// Métodos
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao)); // adiciona na lista uma nova tarefa
	}

	public void removerTarefa(String descricao) {
		// necessário para individualizar o que eu quero remover
		List<Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();

		// Passo por cada tarefa(t) dentro de(tarefaList)
		for (Tarefa t : tarefaList) {
			// se a descrição dessa tarefa for igual a descrição do parâmetro do Método
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t); // adiciono na lista de remoção
			}
		}

		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefa() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
}
