package testes;

import negocio.Contato;
import negocio.Funcionario;

public class TestaCadastroFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedrinho");
		f1.setIdade(50);
		f1.setCpf("12345678901");
		f1.setContato(new Contato("pedrinho@pedrinho.com", "pedrinho.com"));
		f1.show();
		
		Funcionario f2 = new Funcionario("98765432198");
		f2.setNome("James");
		f2.setIdade(30);
		Contato contato = new Contato("james@james.com");
		contato.setUrl("www.james.com");
		f2.setContato(contato);
		f2.show();
	}
}
