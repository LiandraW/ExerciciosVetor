package entra21;

import java.util.Random;
import java.util.Scanner;

public class ExercicioVetor4 {
	 public static void main(String[] args) {
		
	
	Random numRandom = new Random();
	Scanner sc = new Scanner(System.in);

	 int[] vetor = new int[20];

	 for (int i = 0; i < vetor.length; i++) {
	vetor[i] = numRandom.nextInt(40);
	}

	 for (int i = 0; i < vetor.length; i++) {
	System.out.println(vetor[i]);
	}

	 System.out.println("Qual numero de 0 a 40 que você deseja encontrar?");
	int numBuscar = sc.nextInt();
	boolean existe = true;

	 for (int i = 0; i < vetor.length; i++) {

	 if (vetor[i] == numBuscar) {
	System.out.println("A posição desse numero no vetor é: " + (i + 1));
	existe = false;
	}
	}
	if (existe) {
	System.out.println("Esse numero não existe.");
	}

	 	}
	}

