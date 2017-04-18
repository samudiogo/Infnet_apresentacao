package negocio;

public class Aluno extends UsuarioBase {
	private String matricula;
	private int cr;

	public Aluno() {
	}

	public Aluno(String mat) {
		setMatricula(mat);
	}

	public Aluno(String mat, int cr) {
		setMatricula(mat);
		setCr(cr);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCr() {
		return cr;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}

	@Override
	public void show() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=").append(matricula).append(",")
		.append(super.toString()).append(", cr=")
				.append(cr).append("]");
		return builder.toString();
	}

}
