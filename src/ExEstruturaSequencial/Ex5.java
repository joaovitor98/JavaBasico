package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raio = leitura.nextDouble();
        double circun = 2 * Math.PI * raio;

        System.out.printf("Comprimento da circunferencia: %.1f", circun);
    }
}
