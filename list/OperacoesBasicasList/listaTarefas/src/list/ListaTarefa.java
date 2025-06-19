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

		if (!tarefaList.isEmpty()) {
			// Passo por cada tarefa(t) dentro de(tarefaList)
			for (Tarefa t : tarefaList) {
				// se a descrição dessa tarefa for igual a descrição do parâmetro do Método
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefasParaRemover.add(t); // adiciono na lista de remoção
				}
			}
		} else {
			System.out.println("A lista está vazia!");
		}

		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefa() {
		return tarefaList.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	// Método main
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.print("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

		listaTarefa.adicionarTarefa("Tarefa1");
		listaTarefa.adicionarTarefa("Tarefa1");
		listaTarefa.adicionarTarefa("Tarefa2");
		System.out.print("\n\nO número total de elementos na lista agora é: " + listaTarefa.obterNumeroTotalTarefa());

		listaTarefa.removerTarefa("Tarefa2");
		System.out.print(
				"\n\nO número total de elementos na lista agora é: " + listaTarefa.obterNumeroTotalTarefa() + "\n\n");

		listaTarefa.obterDescricoesTarefas();

	}
}
