package entra21;

public class ExercicioVetor5 {

	public static void main(String[] args) {
		//Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.

	        int[] vetNumeros = new int[10];
	       
	        System.out.print("[");
	        for(int i=0; i< vetNumeros.length; i++) {
	            int posicao = i + 1;
	            if(posicao % 2 == 0) {
	                vetNumeros[i] = 0;
	            } else {
	                vetNumeros[i] = 1;
	            }
	           
	            System.out.print(vetNumeros[i]);
	            if(posicao < 10) {
	                System.out.print(",");
	            }
	        }
	        System.out.print("]");       
//	        entradaDados.close();
	        System.exit(0);   
	        }
	}

