package ExEstruturaRepeticao;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        int fat = 1;
        for (int i = fat; i <= num; i++) {
            fat *= i;
        }
        System.out.println(fat);
    }
}
