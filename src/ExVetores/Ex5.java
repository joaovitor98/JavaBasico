package ExVetores;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = leitura.nextInt();
        double vetor[] = new double[n];
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextDouble();
        }
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i] / n;
        }

        System.out.println("Média do vetor: " + media);
        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
