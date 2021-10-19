
public class Exemplo003 {

	public static void main(String[] args) {
		// exercício pág. 11, aula 1

		int a = 5, b = 32, c = 7;
		boolean x;
		x = a < b; // true
		System.out.println("PASSO 1: " + x);
		x = (b > a) && (c > b); // false
		System.out.println(
				"PASSO 2: " + x); /*
									 * a = a – 1; // a passa a valer 4 b = b /a
									 * ; // b é divido por a (4) e fica com 8 c
									 * = c + 1; // c passa a valer 8
									 */
		b /= a -= 1;
		c++;
		x = (b == c); // true
		System.out.println("PASSO 3: " + x);

	}

}
