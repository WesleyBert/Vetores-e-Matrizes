package VetoresMatrizes;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		int vetorInt[] = {2, 5, 1, 3, 4, 9,7,8,10,6};
		int x, e;
		Scanner leitor = new Scanner(System.in);
		boolean encontrado = false;
		
		System.out.println("Digite o número que você deseja encontrar:");
		e = leitor.nextInt();
		for(x = 0; x < vetorInt.length; x++) {
			
			if(e == vetorInt[x]) {
				System.out.println("O número "+ e +" está localizado na posição " + x);			
				encontrado = true;
				break;
			}
			
		}
		if(!encontrado) {
			System.out.println("O número " + e +" não foi encontrado");
		}
	}

}
