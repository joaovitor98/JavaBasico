package EstruturaSequencial;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String x = leitura.next();
        int y = leitura.nextInt();
        double z = leitura.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}