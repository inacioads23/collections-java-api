package agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {	
	Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<Contato>();
	}
	
	// Adiciona um contato à agenda
	public void adicionarContato(String nome, int numero) {
		Contato contato = new Contato(nome, numero);
		contatoSet.add(contato);
		
		// outra opção
		// contatoSet.add(new Contato(nome, numero));
	}
	
	// Exibe todos os contatos da agenda
	public void exibirContatos() {
		if(!contatoSet.isEmpty()) {
			System.out.println("Contatos: " + contatoSet);
		}else {
			System.out.println("Sem dados");
		}
	}
	
	// Pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<Contato>();		
		
			for(Contato c : contatoSet) {
				// startsWith:  inicia com
				if(c.getNome().startsWith(nome)) {
					contatoPorNome.add(c);
				}
			}
			return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		
		
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero); // troco o número
				contatoAtualizado = c; // pego o número atualizado
				break; // paro o laço
			}
		}
		return contatoAtualizado;		
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Camila Martins", 932621931);
		agendaContatos.adicionarContato("Camila Maria", 32621931);
		agendaContatos.adicionarContato("Carlos Malta", 30521931);
		agendaContatos.adicionarContato("Matheus de Jesus", 60525531);
		
		System.out.println("EXIBIR TODOS OS CONTATOS");
		agendaContatos.exibirContatos();
		
		System.out.println("\nPESQUISA POR NOME: 'Ca'");
		System.out.println(agendaContatos.pesquisarPorNome("Ca") );
		
		System.out.println("\nATUALIZA NÚMERO");		
		System.out.println("Número atualizado: " + agendaContatos.atualizarNumeroContato("camila martins", 832621932));
		
		System.out.println("EXIBIR APÓS NÚMERO ATUALIZADO");
		agendaContatos.exibirContatos();
	}

}
