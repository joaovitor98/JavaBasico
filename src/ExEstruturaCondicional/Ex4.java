package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite 4 notas");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();
        int n3 = leitura.nextInt();
        int n4 = leitura.nextInt();
        int media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 7) {
            System.out.println("Recuperação");
        } else if (media < 4) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Media invalida");
        }
    }
}
