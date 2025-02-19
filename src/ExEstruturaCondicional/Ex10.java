package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite 2 numeros");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();

        if (n1 == n2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
