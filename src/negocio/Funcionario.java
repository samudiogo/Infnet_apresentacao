package negocio;

public class Funcionario extends UsuarioBase {
	
	private int idade;
	private String cpf;
	
	public Funcionario() {	}
	
	public Funcionario(String cpf){
		setCpf(cpf);
	}

	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [idade=").append(idade)
		.append(",")
		.append(super.toString())
		.append(", cpf=").append(cpf).append("]");
		return builder.toString();
	}




	@Override
	public void show() {
		System.out.println(this.toString());

	}

}
