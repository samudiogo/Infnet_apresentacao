package testes;

import negocio.Aluno;
import negocio.Contato;

public class TestaCadastroAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setMatricula("123456");
		a1.setNome("Maria Jose");
		a1.setCr(8);
		a1.setContato(new Contato("maria@jose", "www.mariajose.com"));
		a1.show();
		
		Aluno a2 = new Aluno("987654", 7);
		a2.setNome("Joao Paula");
		Contato contato = new Contato();
		contato.setEmail("joao@paula");
		contato.setUrl("www.joaopaula.com");
		a2.setContato(contato);
		a2.show();				
	}
}
