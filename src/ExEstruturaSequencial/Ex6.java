package ExEstruturaSequencial;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite 3 numeros");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();
        int n3 = leitura.nextInt();
        int media = (n1 + n2 + n3) / 3;

        System.out.println("Media: " + media);
    }
}
