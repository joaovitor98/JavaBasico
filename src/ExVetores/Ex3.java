package ExVetores;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int n = leitura.nextInt();
        int vetor[] = new int[n];
        int numPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextInt();
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                numPares++;
            }
        }
        System.out.println("\nQuantidade de Pares: " + numPares);
    }
}
