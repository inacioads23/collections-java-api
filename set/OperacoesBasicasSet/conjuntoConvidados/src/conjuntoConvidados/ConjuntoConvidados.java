package conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	public Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		convidadoSet.add(convidado);

		// outra opção:
		// convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;

		if (!convidadoSet.isEmpty()) {
			for (Convidado c : convidadoSet) {
				if (c.getCodigoConvite() == codigoConvite) {
					convidadoParaRemover = c;
					break; // após encontrar já paro o laço
				}
			}
			convidadoSet.remove(convidadoParaRemover);
		} else {
			System.out.println("Sem dados");
		}
	}

	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirConvidados() {
		if (!convidadoSet.isEmpty()) {
			System.out.println(convidadoSet);
		} else {
			System.out.println("Sem dados");
		}
	}

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

		// CADASTRANDO CONVIDADOS
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 2); // duplicação não é salva
		conjuntoConvidados.adicionarConvidado("Convidado 4", 3);
		conjuntoConvidados.adicionarConvidado("Convidado 5", 4);

		// EXIBINDO CONVIDADOS CADASTRADOS
		System.out.println("CONVIDADOS CADASTRADOS");
		conjuntoConvidados.exibirConvidados();

		// CONTANDO OS CONVIDADOS
		System.out.println("\nQUANTIDADE DE CONVIDADOS: " + conjuntoConvidados.contarConvidados());

		// REMOVENDO UM CONVIDADO
		conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

		// EXIBINDO CONVIDADOS CADASTRADOS APÓS EXCLUSÃO
		System.out.println("\nCONVIDADOS CADASTRADOS APÓS REMOÇÃO");
		conjuntoConvidados.exibirConvidados();
	}
}
