package entra21;

import java.util.concurrent.ThreadLocalRandom;

public class ExercicioVetor3 {

	public static void main(String[] args) {
	
		int[] numerosCriados = new int[16];
        int[] numerosTrocados = new int[16];

 

        for (int i = 0; i < numerosCriados.length; i++) {
            numerosCriados[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }

 

        System.out.println("Números criados: ");
        for (int i = 0; i < numerosCriados.length; i++) {
            System.out.println(numerosCriados[i]);
        }

 

        for (int i = 0; i < (numerosTrocados.length / 2); i++) {
            numerosTrocados[i] = numerosCriados[i + (numerosCriados.length / 2)];
        }
        for (int i = (numerosTrocados.length / 2); i < numerosTrocados.length; i++) {
            numerosTrocados[i] = numerosCriados[i - (numerosCriados.length / 2)];
        }

 

        System.out.println("");
        System.out.println("Números com a posição alterada: ");
        for (int i = 0; i < numerosTrocados.length; i++) {
            System.out.println(numerosTrocados[i]);
        }
	}
}
