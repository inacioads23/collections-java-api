package listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<Tarefa>();
	}
	
	private void adicionarTarefa(String descricao) {
		Tarefa tarefa = new Tarefa(descricao, false);		
		tarefaSet.add(tarefa);
		
		// outra forma
		tarefaSet.add(new Tarefa(descricao, false));
	}
	
	private void removerTarefa(String descricao) {
		Tarefa TarefaParaRemover = null;
		
		if(!tarefaSet.isEmpty()) {
		for(Tarefa t : tarefaSet) {
			if(t.getDescrição().equalsIgnoreCase(descricao)) {
				TarefaParaRemover = t;
				break;
			}
		}
		tarefaSet.remove(TarefaParaRemover);
		}else {
			System.out.println("Tarefa não encontrada\n");
		}
		
		if(TarefaParaRemover == null) {
			System.out.println("Tarefa não encontrada\n");
		}
	}
	
	private void exibirTarefas() {
		if(!tarefaSet.isEmpty()) {
			System.out.println("Todas as Tarefas: " + tarefaSet);
		}else {
			System.out.println("Tarefa não encontrada!\n");
		}
	}
	
	private int contarTarefas() {
		return tarefaSet.size();
	}
	
	private Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		
			for(Tarefa t : tarefaSet) {
				if(t.isConcluida()) {
					tarefasConcluidas.add(t);
				}
			}
			return tarefasConcluidas;
	}
	
	private Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
			for(Tarefa t : tarefaSet) {
				if(t.isConcluida() == false) {
					tarefasPendentes.add(t);
				}
			}
			return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa tarefaParaConcluir = null;
		
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescrição().equalsIgnoreCase(descricao)) {
					t.setStatus(true);
					tarefaParaConcluir = t;
				}
			}			
		}else {
			System.out.println("Tarefa não encontrada!\n");
		}
		
		if(tarefaParaConcluir == null) {
			System.out.println("Tarefa não encontrada!\n");	
		}		
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaPendente = null;
		
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescrição().equalsIgnoreCase(descricao)) {
					t.setStatus(false);
					tarefaParaPendente = t;
				}
			}			
		}else {
			System.out.println("Tarefa não encontrada!\n");
		}
		
		if(tarefaParaPendente == null) {
			System.out.println("Tarefa não encontrada!\n");	
		}		
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.exibirTarefas();
		System.out.println("Quantidade tarefas: " + listaTarefas.contarTarefas() + "\n");
		
		listaTarefas.adicionarTarefa("Dormir");
		listaTarefas.adicionarTarefa("Comer");		
		listaTarefas.adicionarTarefa("Correr");		
		listaTarefas.adicionarTarefa("Viajar");		
		
		listaTarefas.exibirTarefas();
		System.out.println("Quantidade tarefas: " + listaTarefas.contarTarefas() + "\n");

		// Removendo tarefa(s)
		listaTarefas.removerTarefa("Dormir");
		listaTarefas.exibirTarefas();
		
		// Concluindo tarefa(s)
		listaTarefas.marcarTarefaConcluida("Correr");		
		listaTarefas.marcarTarefaConcluida("Comer");
		System.out.println("\nTAREFA(S) DEFINIDA(S) COMO CONCLUÍDA(S): Correr, Comer");
		System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());		
		System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes() + "\n");
		
		listaTarefas.exibirTarefas();		
		System.out.println("Quantidade tarefas: " + listaTarefas.contarTarefas());
		
		// Definindo tarefa(s) como pendente(s)
		System.out.println("\nTAREFA(S) DEFINIDA(S) COMO PENDENTE(S): Viajar");
		listaTarefas.marcarTarefaPendente("Viajar");
		System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());
		System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas() + "\n");	
		
		
		listaTarefas.exibirTarefas();		
		System.out.println("Quantidade tarefas: " + listaTarefas.contarTarefas());
		
	}
}
