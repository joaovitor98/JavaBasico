package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = leitura.nextInt();
        System.out.println("Digite outro numero");
        int n2 = leitura.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma: " + soma);
    }
}
