package negocio;

public abstract class UsuarioBase {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	private Contato contato;
	
	public abstract void show();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[nome=").append(nome)
		.append(", contato=")
		.append(contato).append("]");
		return builder.toString();
	}
	
	
}
