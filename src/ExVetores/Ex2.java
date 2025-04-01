package ExVetores;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int n = leitura.nextInt();
        double vetor[] = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextDouble();
        }
        double soma = 0;
        double media = 0;

        System.out.print("Valores: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
            media = soma / vetor.length;
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
    }
}
