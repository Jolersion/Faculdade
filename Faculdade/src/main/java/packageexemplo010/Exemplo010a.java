package packageexemplo010;

public class Exemplo010a {

	public static void main(String[] args) {
		// pág. 14, aula 2
		
		Pessoa[] pessoas = { new Pessoa("Joao", "1111-1111"), 
				new Pessoa("Maria", "2222-2222"),
				new Profissional("Luiz", "3333-3333", "Advogado") };
		for (int i = 0; i < 3; i++)
			pessoas[i].exibir();

	}

}
