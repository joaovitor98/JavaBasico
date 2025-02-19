package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da Base Maior");
        double bMaior = leitura.nextDouble();
        System.out.println("Digite o valor da Base Menor");
        double bMenor = leitura.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = leitura.nextDouble();

        double area = ((bMaior + bMenor) * altura) / 2;

        System.out.println("Area do Trapézio: " + area);
    }
}
