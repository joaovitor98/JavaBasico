package ExEstruturaRepeticao;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int soma = 0;
        int media = 0;
        for (int i = 0; i <= 10; i++) {
            int num = leitura.nextInt();
            soma += num;
            media = soma / 10;
        }
        System.out.println(media);
    }
}
