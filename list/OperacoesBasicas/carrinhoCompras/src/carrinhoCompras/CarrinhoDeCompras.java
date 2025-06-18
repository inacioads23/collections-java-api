package carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<Item>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade)); // adiciona na lista um novo item
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<Item>();

		// se 'itemList' não estiver vazia
		if (!itemList.isEmpty()) {
			// Passo por cada Item(i) dentro de(itemList)
			for (Item i : itemList) {
				// se a nome desse Item for igual ao nome do parâmetro do Método
				if (i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i); // adiciono na lista de remoção
				}
			}
			
			itemList.removeAll(itensParaRemover);
			
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public double calcularValorTotal() {
		double vlTotal = 0 ; // inicializa como double
		
		// se 'itemList' não estiver vazia
		if (!itemList.isEmpty()) {
			// Passo por cada Item(i) dentro de(itemList)
			for (Item i : itemList) {
				// vlItem = preco + qt do 'i' encontrado
				double vlItem = i.getPreco() * i.getQuantidade();
				vlTotal += vlItem; // vlTotal = vlTotal + vlItem
			}
			return vlTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirItens() {
		if (!itemList.isEmpty()) {
			System.out.println(itemList);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public static void main(String[] args) {
		// Instanciando um carrinho de compras
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		// Adicionando itens no carrinho
		carrinhoDeCompras.adicionarItem("Bolacha", 5.0, 3);
		carrinhoDeCompras.adicionarItem("Bolacha", 4.1, 5);
		carrinhoDeCompras.adicionarItem("Maçã", 3.0, 6);

		// Exibindo os itens no carinho
		carrinhoDeCompras.exibirItens();

		// Removendo um item do carrinho
		carrinhoDeCompras.removerItem("bolacha");
		
		// Exibindo os itens atualizados no carinho
		carrinhoDeCompras.exibirItens();
		
		// Calculando e exibindo o valor total da compra
		System.out.printf("\nO valor da compra é: R$ %.2f", carrinhoDeCompras.calcularValorTotal());
	}

}
