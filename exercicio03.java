package VetoresMatrizes;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int linha, coluna, diagonalP = 0, diagonalS = 0, somaDiagonalP = 0, somaDiagonalSeg = 0;
        Scanner leitor = new Scanner(System.in);
        int x;

        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println("\nEntre com um número: ");
                matriz[linha][coluna] = leitor.nextInt();

                if (linha == coluna) {
                    diagonalP = matriz[linha][coluna];
                    somaDiagonalP += diagonalP;
                }

                if ((linha + coluna) == 2) {
                    diagonalS = matriz[linha][coluna];
                    somaDiagonalSeg += diagonalS;
                }
            }
        }

        System.out.println("Diagonal Principal:");
        for (linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][linha] + " ");
        }

        System.out.println("\nDiagonal Secundária:");
        for (linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][2 - linha] + " ");
        }

        System.out.println("\nSomatório da diagonal principal: " + somaDiagonalP);
        System.out.println("Somatório da diagonal secundária: " + somaDiagonalSeg);
    }
}
