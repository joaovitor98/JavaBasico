package EstruturaRepeticao;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        char resp;
        do {
            System.out.println("Digite a temperatura em celcius");
            double c = leitura.nextInt();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.println("Deseja repetir (s/n)?");
            resp = leitura.next().charAt(0);
        } while (resp != 'n');
    }
}
