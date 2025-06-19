package conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {	
	private Set<String> conjPalavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.conjPalavrasUnicas = new HashSet<String>();
	}
	
	// Adiciona uma palavra ao conjunto
	public void adicionarPalavra(String palavra) {
		conjPalavrasUnicas.add(palavra);
	}
	
	// Remove uma palavra do conjunto
	public void removerPalavra(String palavra) {
		if(!conjPalavrasUnicas.isEmpty()) {
			if(conjPalavrasUnicas.contains(palavra)) {
				conjPalavrasUnicas.remove(palavra);
			}else {
				System.out.println("Palavra não encontrada");
			}
		}else {
			System.out.println("Sem dados");
		}
	}
	
	// Verifica se uma palavra está presente no conjunto
	public boolean verificarPalavra(String palavra) {
		return conjPalavrasUnicas.contains(palavra);		
	}
	
	public void exibirPalavrasUnicas() {
		if(!conjPalavrasUnicas.isEmpty()) {
			System.out.println("Conjunto de palavras" + conjPalavrasUnicas);
		}else {
			System.out.println("Sem dados");
		}
	}
	
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		// Adicinando palavras
		conPalavrasUnicas.adicionarPalavra("Casa");
		conPalavrasUnicas.adicionarPalavra("Telha");
		conPalavrasUnicas.adicionarPalavra("Telha");
		conPalavrasUnicas.adicionarPalavra("Parede");
		
		// Exibindo as palavras
		conPalavrasUnicas.exibirPalavrasUnicas();
		
		// Removendo uma palavra
		conPalavrasUnicas.removerPalavra("Telha");
		
		// Exibindo as palavras após remoção
		conPalavrasUnicas.exibirPalavrasUnicas();
		
		System.out.println("\nPalavra existe? " + conPalavrasUnicas.verificarPalavra("Telha"));		

	}

}
