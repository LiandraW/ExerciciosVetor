package entra21;

import java.util.Random;

public class ExercicioVetor6 {

	// Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que
	// possuírem valores negativos.

	public static void main(String[] args) {



        Random rd = new Random();
        int[] vetor = new int[40];

 

        // popula vetor
        for (int i = 0; i < vetor.length; i++) {
            // gera numeros aleatórios com alguns numeros negativos
            vetor[i] = (rd.nextInt(50) - 10);
        }

 

        // mostra o vetor original ao usuario
        System.out.println("Vetor Original");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
            if (i == (vetor.length - 1)) {
                System.out.println("\n");
            }
        }

 

        // atribui zero "0" na posição que possui numero negativo
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
        System.out.println("Atribuido zero aos numeros negativos");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

    }
}
