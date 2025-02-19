package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double aumentoSalario;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario");
        double salario = leitura.nextDouble();

        if (salario < 2000) {
            aumentoSalario = (salario * 0.20) + salario;
        } else {
            aumentoSalario = (salario * 0.10 + salario);
        }
        System.out.printf("Valor atual do salario: %.2f", aumentoSalario);
    }
}
