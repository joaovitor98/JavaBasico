package EstruturaCondicional;

import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento");
        int nasc = leitura.nextInt();
        int i = 2025 - nasc;
        System.out.println("Sua idade é " + i);

        if (i >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}


