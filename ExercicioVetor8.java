package entra21;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExercicioVetor8 {
	// Leia um vetor de 40 posições e acumule os valores do primeiro elemento no
	// segundo, deste no terceiro e assim por diante. Ao final, escreva o vetor
	// obtido.

	public static void main(String[] args) {
		
		// * 8. Leia um vetor de 40 posições e acumule os valores do primeiro elemento no
         // segundo, deste no terceiro e assim por diante. Ao final, escreva o vetor
         //obtido.
        
		Random rd = new Random();
        int[] vetor = new int[40];
        int[] vetorSomatorio = new int[40];
        int auxiliar;

 

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(45);
        }

 

        // mostra ao usuario o vetor original
        System.out.println("VETOR ORIGINAL:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i + 1) + "°[" + vetor[i] + "] ");
            if (i == (vetor.length - 1)) {
                System.out.println("\n");
            }
        }

 

        // acumula o primeiro valor no segundo, o segundo no terceiro...
        for (int i = 0; i < vetorSomatorio.length; i++) {
            auxiliar = (i > 0) ? i - 1 : i;
            vetorSomatorio[i] = (i > 0) ? vetor[i] + vetorSomatorio[auxiliar] : vetor[i];
        }

 

        // mostra ao usuario o vetor alterado
        System.out.println("VETOR ALTERADO:");
        for (int i = 0; i < vetorSomatorio.length; i++) {
            System.out.print((i + 1) + "°[" + vetorSomatorio[i] + "] ");
            if (i == (vetorSomatorio.length - 1)) {
                System.out.println("\n");
            }
        }
        System.exit(0);
    }
}
