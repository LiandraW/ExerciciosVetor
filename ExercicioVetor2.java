package entra21;

public class ExercicioVetor2 {

	public static void main(String[] args) {

		// 2. Declare um vetor de 10 posi��es e o preencha
		// com os 10 primeiros n�meros impares e o escreva.
		//Scanner entradaDados = new Scanner(System.in);
		int[] vetorNumeros = new int[10];
		boolean preencheDezNumeros = true;
		int qtdNumerosPreenchidos = 0;
		int numerosParaInserir = 1;

		do {
			if (numerosParaInserir % 2 != 0) {
				vetorNumeros[qtdNumerosPreenchidos] = numerosParaInserir;
				qtdNumerosPreenchidos++;
			}

			numerosParaInserir++;

			// condi��o do la�o
			if (qtdNumerosPreenchidos == 10) {
				preencheDezNumeros = false;
			}
		} while (preencheDezNumeros);

		System.out.println("Os n�meros s�o:");

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Posi��o vetorNumeros[" + (i + 1) + "] = " + vetorNumeros[i]);
		}

		//entradaDados.close();
		System.exit(0);
	}
}
