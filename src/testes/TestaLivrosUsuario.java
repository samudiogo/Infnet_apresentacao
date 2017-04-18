package testes;

import java.util.ArrayList;
import java.util.List;

import negocio.Aluno;
import negocio.Contato;
import negocio.Livro;

public class TestaLivrosUsuario {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setMatricula("123456");
		a1.setNome("Maria Jose");
		a1.setCr(8);
		a1.setContato(new Contato("maria@jose", "www.mariajose.com"));
		
		List<Livro> livrosLindolfo = new ArrayList<Livro>();
		
		livrosLindolfo.add(new Livro("Diagramas UML"));
		livrosLindolfo.add(new Livro("Programação Java", 3));
		livrosLindolfo.add(new Livro("Desenvolvimento Mobile"));
		
		a1.setLivros(livrosLindolfo);
		
		a1.show();
	}
}
