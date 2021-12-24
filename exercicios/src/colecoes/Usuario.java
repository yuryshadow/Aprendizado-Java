package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;
	
	Usuario(String nome){
		this.nome = nome;
	}
	
	// Sempre que for imprimir um objeto ser� impresso o que est� no toString
	public String toString() {
		return "Meu nome � " + this.nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	 
}
