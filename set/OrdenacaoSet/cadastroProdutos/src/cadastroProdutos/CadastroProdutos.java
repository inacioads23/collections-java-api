package cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	public Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		Produto produto = new Produto(cod, nome, preco, quantidade);
		produtoSet.add(produto);
		
		// outra opção:
		// produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	// Com COMPARABLE
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<Produto>(produtoSet); // TreeSet - mantém automaticamente em ordem crescente
		return produtosPorNome;
	}
	
	// Com COMPARATOR
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet); // 'produtosPorPreco' recebe tudo que está em 'produtoSet'
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1, "Computador", 1500.00, 10);
		cadastroProdutos.adicionarProduto(2, "Mouse", 50.00, 5);
		cadastroProdutos.adicionarProduto(3, "Monitor", 500.00, 7);
		cadastroProdutos.adicionarProduto(4, "Caixa de som", 150.00, 4);
		
		System.out.println("ORDENADO POR NOME");
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println("\nORDENADO POR PRECO");
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}

}
