package MatrizesVetores;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n = leitura.nextInt();
        double vetor[] = new double[n];
        for (int i= 0; i<vetor.length;i++) {
            System.out.println("Digite um numero");
            vetor[i] = leitura.nextDouble();
        }
        double soma = 0.0;

        for (int i=0; i< vetor.length; i++){
            soma += vetor[i];
        }
        double media = soma/n;

        System.out.printf("Media de Altura = %.2f", media);
    }
}
