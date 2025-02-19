package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite quantos anos você tem");
        int idade = leitura.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
