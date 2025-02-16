package EstruturaCondicional;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite 2 notas");
        double nota1 = leitura.nextDouble();
        double nota2 = leitura.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6 && media < 10) {
            System.out.println("Parabens, você foi aprovado");
        } else if (media > 0 && media < 6) {
            System.out.println("Estude mais");
        } else {
            System.out.println("Média invalida");
        }
    }
}
