package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado do cubo");
        double comp = leitura.nextDouble();
        double vol = Math.pow(comp, 3);
        System.out.println(vol);
    }
}
