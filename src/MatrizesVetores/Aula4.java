package MatrizesVetores;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o numero de linhas da matriz");
        int l = leitura.nextInt();
        System.out.println("Digite o numero de colunas da matriz");
        int c = leitura.nextInt();

        int matriz[][] = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite um numero");
                matriz[i][j] = leitura.nextInt();
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("| %d ", matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
