package entra21;

import java.util.concurrent.ThreadLocalRandom;

public class ExercicioVetor7 {


	public static void main(String[] args) {
        /*
         * 7.    Leia dois vetores de 20 posições e calcule um outro vetor contendo, 
         * nas posições pares os valores do primeiro e 
         * nas posições impares os valores do segundo.
         * */
        int[] vetUm = new int[20];
        int[] vetDois = new int[20];
        int[] vetPosicoes = new int[40];
        String textVetorUm="[", textVetorDois="[", textVetorPosicao="[";
        int indiceVetUm=0, indiceVetDois=0;
        
        for (int i = 0; i < vetUm.length; i++) {
            vetUm[i] = ThreadLocalRandom.current().nextInt(0, 100);
            textVetorUm += (i < vetUm.length - 1) ? vetUm[i] + ", " : vetUm[i] + "]";
            
            vetDois[i] = ThreadLocalRandom.current().nextInt(0, 100);
            textVetorDois += i < vetDois.length - 1 ? vetDois[i] + ", " : vetDois[i] + "]";
        }
        
        System.out.println("Vetor 1: " + textVetorUm );
        System.out.println("Vetor 2: " + textVetorDois );
        
        for (int i = 0; i < vetPosicoes.length; i++) {
            int posicao = (i+1);
            if(posicao % 2 == 0) {
                vetPosicoes[i] = vetUm[indiceVetUm];
                indiceVetUm++;
            } else {
                vetPosicoes[i] = vetDois[indiceVetDois];
                indiceVetDois++;
            }
            textVetorPosicao += i < vetPosicoes.length - 1 ? vetPosicoes[i] + ", " : vetPosicoes[i] + "]";
        }

 

        System.out.println("Vetor Calculado: " + textVetorPosicao );
        System.exit(0);
    }
}
