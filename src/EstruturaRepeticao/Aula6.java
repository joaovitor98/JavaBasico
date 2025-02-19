package EstruturaRepeticao;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero ");
        int num = leitura.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
