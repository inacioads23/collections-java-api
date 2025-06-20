package listaTarefas;

import java.util.Objects;

public class Tarefa {
	private String descrição;
	private boolean concluida;	
	

	public Tarefa(String descrição, boolean concluida) {
		this.descrição = descrição;
		this.concluida = concluida;
	}


	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setStatus(boolean status) {
		this.concluida = status;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descrição);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descrição, other.descrição);
	}

	@Override
	public String toString() {
	    String statusFormatado = concluida ? "Concluída" : "Pendente";
	    return "{" + descrição + ", " + statusFormatado + "}";
	}
	

}
