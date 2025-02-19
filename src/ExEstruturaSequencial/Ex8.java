package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor em reais");
        double real = leitura.nextDouble();
        System.out.println("Digite a cotação do dolar");
        double cotdolar = leitura.nextDouble();

        double dolar = real / cotdolar;

        System.out.printf("Valor em Dolares: %.2f", dolar);
    }
}
