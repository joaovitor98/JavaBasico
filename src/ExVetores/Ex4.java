package ExVetores;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = leitura.nextInt();
        int vetor[] = new int[n];
        int vetor1[] = new int[n];
        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitura.nextInt();
        }
        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = leitura.nextInt();
        }
        int soma = 0;
        System.out.println("Valor Resultante: ");
        for (int i = 0; i < vetor.length || i > vetor1.length; i++) {
            soma = vetor[i] + vetor1[i];
            System.out.println(soma);
        }
    }
}
