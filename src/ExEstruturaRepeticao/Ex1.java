package ExEstruturaRepeticao;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = leitura.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("I: " + i);
        }
    }
}
