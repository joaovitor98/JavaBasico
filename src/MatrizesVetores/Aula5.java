package MatrizesVetores;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um tamanho da sua matriz");
        int n = leitura.nextInt();

        int matriz[][] = new int[n][n];
        System.out.println("Digite o valor das linhas e colunas");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leitura.nextInt();
            }
        }
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%d ", matriz[i][i]);
        }
        System.out.printf("%n");
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("Numeros Negativos: " + cont);
    }
}