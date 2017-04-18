package negocio;

public class Contato {
	private String email;
	private String url;

	public Contato() {
	}

	public Contato(String email, String url) {
		setEmail(email);
		setUrl(url);
	}

	public Contato(String email) {
		setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [email=").append(email).append(", url=").append(url).append("]");
		return builder.toString();
	}

}
