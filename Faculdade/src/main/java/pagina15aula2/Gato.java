package pagina15aula2;

public class Gato extends Mamifero {

	public Gato() {
		familia = "Felidae";
	}

	@Override
	public void mamar() {
		System.out.println("Gato mamando...");
	}

}
