package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor de um numero");
        int num = leitura.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        } else if (num % 2 == 1) {
            System.out.println("Impar");
        } else {
            System.out.println("Valor invalido");
        }
    }
}
