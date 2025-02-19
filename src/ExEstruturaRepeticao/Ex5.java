package ExEstruturaRepeticao;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
