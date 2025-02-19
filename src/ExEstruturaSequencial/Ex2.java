package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o comprimento do quadrado");
        int lado = leitura.nextInt();
        int per = lado * 4;
        System.out.println("Perimetro: " + per);

    }
}
