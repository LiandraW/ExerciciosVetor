package entra21;

public class ExercicioVetor10 {

	/*
	 * Leia um vetor de 5 posições contendo os caracteres de um numero. Em seguida
	 * escreva esse numero por extenso.
	 */

	public static void main(String[] args) {
		String[] caracteresNumero = { "C", "i", "n", "c", "o" };

		String numeroPorExtenso = "";

		System.out.println("Caracteres no vetor: ");

		for (int i = 0; i < caracteresNumero.length; i++) {

			numeroPorExtenso += caracteresNumero[i];

			System.out.println("caracteresNumero[" + i + "] -> " + caracteresNumero[i]);

		}

		System.out.println("");

		System.out.println("Número escrito: ");

		System.out.println(numeroPorExtenso);
	}

}
