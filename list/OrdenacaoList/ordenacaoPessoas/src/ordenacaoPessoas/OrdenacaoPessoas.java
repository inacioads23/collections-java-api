package ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa(nome, idade, altura);		
		pessoaList.add(pessoa);
		
		// outra opção:
		//pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	// Utiliza Comparable - 'Altera' a Class principal (Pessoa)
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);		
		return pessoasPorIdade;
		
	}
	
	// Utiliza Comparator - 'Não altera' a Class principal (Pessoa)
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<Pessoa>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
		ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println("SEM ORDENAÇÃO\n" + ordenacaoPessoas.pessoaList);

		System.out.println("\nORDENAÇÃO POR IDADE - Comparable\n" + ordenacaoPessoas.ordenarPorIdade());
		System.out.println("\nORDENAÇÃO POR ALTURA - Comparator\n" + ordenacaoPessoas.ordenarPorAltura());
	}

}

