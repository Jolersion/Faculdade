
public class Exemplo006 {

	public static void main(String[] args) {
		// Exemplo 006, pág. 18, aula 1

		// Calculo do valor médio da sequencia y = f(x) = x * x
		// Media = Somatorio dos valores / quantidade
		// Limites 1 a 5

		double soma = 0.0;
		for (int x = 1; x <= 5; x++)
			soma += Math.pow(x, 2);
		// eleva x a potência 2 e acumula
		System.out.println(soma / 5);

	}

}
