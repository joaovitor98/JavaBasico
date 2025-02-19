package EstruturaRepeticao;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número");

        int x = leitura.nextInt();

        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = leitura.nextInt();
        }
        System.out.println(soma);
    }
}
