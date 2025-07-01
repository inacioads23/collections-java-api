package agendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<String, Integer>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone); // 'put' Adiciona e atualiza
		}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}else {
			System.out.println("Agenda vazia");
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorTelefone = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorTelefone = agendaContatoMap.get(nome);			
		}
		return numeroPorTelefone;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Camila", 932621932); // Adiciona
		agendaContatos.adicionarContato("Camila", 32621932); // Adiciona
		agendaContatos.adicionarContato("Camila Cavalcante", 31621931);
		agendaContatos.adicionarContato("Camila Dio", 21621931);
		agendaContatos.adicionarContato("Maria Silva", 31621931);
		agendaContatos.adicionarContato("Camila", 44444); // ultimo atualizado
		
		agendaContatos.exibirContatos();
		
		System.out.print("\nO número é: " + agendaContatos.pesquisarPorNome("Maria Silva") + "\n");
		
		agendaContatos.removerContato("Maria Silva");
		agendaContatos.exibirContatos();
		
		System.out.println("\n" + agendaContatos.pesquisarPorNome("Maria"));
		
	}
}
