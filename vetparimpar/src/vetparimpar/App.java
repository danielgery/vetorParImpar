package vetparimpar;

import java.util.Arrays;

/**
 * A) Dado um vetor com números pares e ímpares, escreva um método int[]
 * separaParImpar(int[] vet); para colocar todos os números pares à frente no
 * vetor e os ímpares ao final. Escreva o método em duas versões: Usando um
 * vetor auxiliar Sem usar outro vetor B) Analise a complexidade de cada
 * implementação (Oh(), Omega() e Theta(), melhor e pior caso) e diga quantas
 * iterações cada uma executa, em função do tamanho da entrada; C) Execute ambas
 * as implementações para entradas com a seguinte configuração: 100 elementos,
 * 50 pares e 50 ímpares; 100 elementos, 20 pares e 80 ímpares; 100 elementos,
 * 80 pares e 20 ímpares; 100000 elementos, 50000 pares e 50000 ímpares; 100000
 * elementos, 20000 pares e 80000 ímpares; 100000 elementos, 80000 pares e 20000
 * ímpares;
 */

public class App {

	public static void main(String[] args) {
		int[] vet = { 1, 2, 3, 400, 5998, 5, 5, 5, 5, 5, 5, 8, 6, 66, 6, 66, 6, 6 };
		for (int i = 0; i < vet.length; i++) {
			vet[i] = i + 1;
		}
		int[] vet2 = (int[]) separaParImparAux(vet);

		System.out.println(Arrays.toString(vet2));

	}

	private static int[] separaParImparAux(int[] vet) {

		int[] vetAux = new int[vet.length];
		int count = 0;
		int count2 = vet.length - 1;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {// par
				vetAux[count] = vet[i];
				count++;
			} else {
				vetAux[count2] = vet[i];
				count2--;
			}
		}

		return vetAux;
	}

	private static int[] separaParImpar(int[] vet) {

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {// par
				
				
			}else { //impar
				
			}
		}
		return vet;
	}
}
