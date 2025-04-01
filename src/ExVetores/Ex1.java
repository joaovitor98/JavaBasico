package ExVetores;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = leitura.nextInt();
        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextInt();
        }
        System.out.print("Numeros negativos: \n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
