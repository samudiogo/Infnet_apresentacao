package negocio;

public class Livro {
	private String titulo;
	private int quantidade;
	
	
	
	public Livro() {
		
	}



	public Livro(String titulo) {
		super();
		this.titulo = titulo;
	}



	public Livro(String titulo, int quantidade) {
		
		this.titulo = titulo;
		this.quantidade = quantidade;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [titulo=").append(titulo).append(", quantidade=").append(quantidade).append("]");
		return builder.toString();
	}
	
	
}
