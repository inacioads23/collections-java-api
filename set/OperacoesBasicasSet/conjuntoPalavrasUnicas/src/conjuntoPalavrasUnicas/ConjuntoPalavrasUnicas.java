package conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {	
	private Set<String> setPalavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.setPalavrasUnicas = new HashSet<String>();
	}
	
	// Adiciona uma palavra ao conjunto
	public void adicionarPalavra(String palavra) {
		setPalavrasUnicas.add(palavra);
	}
	
	// Remove uma palavra do conjunto
	public void removerPalavra(String palavra) {
		if(!setPalavrasUnicas.isEmpty()) {
			if(setPalavrasUnicas.contains(palavra)) {
				setPalavrasUnicas.remove(palavra);
			}else {
				System.out.println("Palavra não encontrada");
			}
		}else {
			System.out.println("Sem dados");
		}
	}
	
	// Verifica se uma palavra está presente no conjunto
	public boolean verificarPalavra(String palavra) {
		return setPalavrasUnicas.contains(palavra);		
	}
	
	public void exibirPalavrasUnicas() {
		if(!setPalavrasUnicas.isEmpty()) {
			System.out.println("Conjunto de palavras" + setPalavrasUnicas);
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
