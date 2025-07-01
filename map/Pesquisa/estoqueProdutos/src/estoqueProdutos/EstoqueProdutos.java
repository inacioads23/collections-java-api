package estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>(); // Inicia HashMap vazio
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) { // possibilita pegar os valores do 'objeto Produto'
				valorTotalEstoque += p.getQuantidade() * p.getPreco(); 
			}			
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreço = Double.MIN_VALUE; // trabalha no inverso
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreço) {
					produtoMaisCaro = p;
					maiorPreço = p.getPreco();
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreço = Double.MAX_VALUE;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() < menorPreço) {
					produtoMaisBarato = p;
					menorPreço = p.getPreco();
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto prodMaiorVlTotalEstoque = null;
		double maiorQuantidade = Double.MIN_VALUE;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				double vlTotal = p.getQuantidade() * p.getPreco();
				if(vlTotal > maiorQuantidade) {
					prodMaiorVlTotalEstoque = p;
					maiorQuantidade = vlTotal;
				}
			} 			
		}		
		return prodMaiorVlTotalEstoque;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1, "Notebook", 5, 3500.0);
		estoqueProdutos.adicionarProduto(2, "PC", 6, 3000.0);
		estoqueProdutos.adicionarProduto(3, "Mouse", 6, 50.0);
		
		estoqueProdutos.exibirProdutos();
		
		System.out.println("\nValor total em estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
		
		System.out.println("Produto mais caro: R$ " + estoqueProdutos.obterProdutoMaisCaro());
		
		System.out.println("Produto mais barato: R$ " + estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("Produto com maior ValorTotal no Estoque: R$ " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}

}
