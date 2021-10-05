package pagina15aula2;

public class Exemplo011a {

	public static void main(String[] args) {
		// pág. 17 aula 2

		Object[] objetos = { new Gato(), new Morcego(), new Cachorro() };
		for (int i = 0; i < 3; i++) {
			if (objetos[i] instanceof Voo)
				((Voo) objetos[i]).voar();
			// Conversão de tipo (type cast) necessária
		}

	}

}
