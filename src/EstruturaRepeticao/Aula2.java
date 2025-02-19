package EstruturaRepeticao;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num = leitura.nextInt();

        int soma = 0;

        for (int i = 0; i < num; i++) {
            int x = leitura.nextInt();
            soma = soma + x;

        }
        System.out.println("Resultado: " + soma);
    }
}
