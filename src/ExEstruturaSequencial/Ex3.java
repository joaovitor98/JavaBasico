package ExEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double c = leitura.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.printf("Temperatura em Fahrenheit: %.1f", f);
    }
}
