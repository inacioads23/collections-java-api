package somaNumeros;

// int maiorNumero = Integer.MIN_VALUE;
// O objetivo é inicializar maiorNumero com um valor TÃO PEQUENO que qualquer número da lista seja maior que ele

//int menorNumero = Integer.MAX_VALUE;
// O objetivo é inicializar menorNumero com um valor TÃO GRANDE que qualquer número da lista seja menor que ele

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listSomaNumeros;

	public SomaNumeros() {
		this.listSomaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listSomaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int vlSoma = 0;
		if(!listSomaNumeros.isEmpty()) {
			
		for(Integer numero : listSomaNumeros) {
			vlSoma += numero;
		}
		return vlSoma;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public int encontrarMaiorNumero() {
		// Aparente uso invertido. Ver explicação no topo
		int maiorNumero = Integer.MIN_VALUE;
		if(!listSomaNumeros.isEmpty()) {
			for(Integer numero : listSomaNumeros) {
				if(numero > maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public int encontrarMenorNumero() {
		// Aparente uso invertido. Ver explicação no topo
		int menorNumero = Integer.MAX_VALUE;
		if(!listSomaNumeros.isEmpty()) {
			for(Integer numero : listSomaNumeros) {
				if(numero < menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirNumeros() {
		if(!listSomaNumeros.isEmpty()) {
			System.out.println("Números da lista" + listSomaNumeros);
		}else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(10);
		somaNumeros.adicionarNumero(5);
		somaNumeros.adicionarNumero(2);
		
		
		
		// Encontrando e exibindo o maior número na lista
	    System.out.println("Soma = " + somaNumeros.calcularSoma());		
		
		// Encontrando e exibindo o maior número na lista
	    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
	    
	    // Encontrando e exibindo o menor número na lista
	    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
	    
	    somaNumeros.exibirNumeros();
	}
}
