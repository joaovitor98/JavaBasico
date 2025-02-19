package ExEstruturaRepeticao;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int soma = 0;
        int num;
        Scanner leitura = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            num = leitura.nextInt();
            soma += num;
        }
        int media = soma / 5;
        System.out.println(media);
    }
}
