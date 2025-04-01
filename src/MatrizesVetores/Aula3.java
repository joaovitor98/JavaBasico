package MatrizesVetores;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite quantidade de alturas que deseja calcular");
        int q = leitura.nextInt();
        double[] vetor = new double[q];

        for (int i = 0; i < q; i++) {
            System.out.println("Digite uma altura");
            vetor[i] = leitura.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < q; i++) {
            soma += vetor[i];
        }
        double media = soma / q;

        System.out.printf("Altura média: %.2f", media);

        leitura.close();
    }
}