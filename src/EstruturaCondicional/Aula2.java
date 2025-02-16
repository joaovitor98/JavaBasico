package EstruturaCondicional;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quanto tempo você passou no telefone?");
        int min = leitura.nextInt();

        double conta = 50.0;
        if (min > 100) {
            conta += (min - 100) * 2.0;
        }
        System.out.printf("Valor da conta: %.2f", conta);
    }
}
