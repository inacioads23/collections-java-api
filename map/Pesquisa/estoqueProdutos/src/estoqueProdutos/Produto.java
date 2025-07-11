package estoqueProdutos;

// Quando trabalho com 'Map' não preciso definir 'hashCode and equals' pois a chave já contém elementos únicos

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	
	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]\n";
	}

}
