package entra21;

import java.util.Scanner;

public class ExercicioVetor9 {

	public static void main(String[] args) {
		/*
		 * 9- Leia um vetor contendo letras de uma frase inclusive os espa�os em branco.
		 * Retirar os espa�os em branco do vetor e depois escreve-los.
		 */
		String vetorFrase;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Escreve qualquer coisa a�, manow: ");
		vetorFrase = entradaDados.nextLine();
		vetorFrase = vetorFrase.replaceAll(" ", "");
		for (int i = 0; i < vetorFrase.length(); i++) {
			System.out.print(vetorFrase.charAt(i));
		}

		System.exit(0);
	}
}
