package entra21;

import java.util.Scanner;

public class ExercicioVetor9 {

	public static void main(String[] args) {
		/*
		 * 9- Leia um vetor contendo letras de uma frase inclusive os espaços em branco.
		 * Retirar os espaços em branco do vetor e depois escreve-los.
		 */
		String vetorFrase;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Escreve qualquer coisa aí, manow: ");
		vetorFrase = entradaDados.nextLine();
		vetorFrase = vetorFrase.replaceAll(" ", "");
		for (int i = 0; i < vetorFrase.length(); i++) {
			System.out.print(vetorFrase.charAt(i));
		}

		System.exit(0);
	}
}
