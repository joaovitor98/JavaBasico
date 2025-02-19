package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = leitura.nextDouble();
        System.out.println("Digite outro numero");
        double n2 = leitura.nextDouble();

        double somaQuad = Math.pow(n1, 2) + Math.pow(n2, 2);

        System.out.println("Soma dos quadrados: " + somaQuad);
    }
}
