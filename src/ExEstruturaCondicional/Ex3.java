package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite 2 numeros");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();

        if (n1 > n2) {
            System.out.println("Maior: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior: " + n2);
        } else {
            System.out.println("Igual");
        }
    }
}
