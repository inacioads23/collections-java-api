package catalagoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		livroList.add(livro);

		// outra opção:
		// livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		} else {
			System.out.println("A lista está vazia");
		}

		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervalAno = new ArrayList<>();

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervalAno.add(l);
				}
			}
		}

		return livrosPorIntervalAno;
	}

	// Retornar o primeiro livro encontrado
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livrosPorTitulo = null;

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
				livrosPorTitulo = l;
				break; // se achou livro não precisa prosseguir
				}
			}
		}

		return livrosPorTitulo;
	}
	
	public void exibirLivros() {
		if(!livroList.isEmpty()) {
			System.out.println(livroList);
		}else {
			System.out.println("A lista está vazia");
		}
	} 
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		// Adicionado livros
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		// Pesquisando por autor
		System.out.println("PESQUISA POR AUTOR");
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
		
		// Pesquisando por intervalo de ano
		System.out.println("\nPESQUISA POR INTERVALO DE ANO");
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
		
		// Pesquisando por título e retornando o primeiro livro
		System.out.println("\nPESQUISA POR TÍTULO");
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
		
	}
}
