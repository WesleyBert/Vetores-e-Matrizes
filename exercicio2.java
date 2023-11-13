package VetoresMatrizes;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args) {
			
			int vetor[] = new int[10];
			int somaVetor=0,x;
			float mediaVet;
			
			Scanner leia = new Scanner(System.in);
			
			for(x=0;x<10;x++) {
				System.out.println("\nEntre com um número: ");
				vetor[x] = leia.nextInt();
				if(x % 2 == 1) {
					System.out.println("\nElemento de índice impar: "+vetor[x]);
				}
				if(vetor[x] % 2 == 0) {
					System.out.println("\nO número: "+vetor[x]+" é um elemento par");
				}
				somaVetor += vetor[x];
			}
			mediaVet = somaVetor / x;
			System.out.println("\nSoma dos elementos do vetor: "+somaVetor);
			System.out.println("\nA média dos elementos do vetor é: "+mediaVet);

		}

	}

