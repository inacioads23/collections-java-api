package ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	List<Integer> numeroList;

	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(numero);		
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> numeroAscendente = new ArrayList<Integer>(numeroList);
		
		if(!numeroList.isEmpty()) {
			Collections.sort(numeroAscendente);
			return numeroAscendente;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}		
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numeroDescendente = new ArrayList<Integer>(numeroList);
		
		if(!numeroList.isEmpty()) {
			numeroDescendente.sort(Collections.reverseOrder());
			return numeroDescendente;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}		
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		
		ordenacaoNumeros.adicionarNumero(10);
		ordenacaoNumeros.adicionarNumero(12);
		ordenacaoNumeros.adicionarNumero(5);
		ordenacaoNumeros.adicionarNumero(15);
		ordenacaoNumeros.adicionarNumero(2);
		
		System.out.println("Ascendente" + ordenacaoNumeros.ordenarAscendente());
		System.out.println("Descendente" + ordenacaoNumeros.ordenarDescendente());
	}

}
