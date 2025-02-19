package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da medida em metros");
        double metros = leitura.nextDouble();
        double cent = metros * 100;
        System.out.println("Centimetros: " + cent);
    }
}
