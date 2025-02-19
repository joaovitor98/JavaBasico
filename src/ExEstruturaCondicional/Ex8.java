package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite 3 numeros");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();
        int n3 = leitura.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("Menor: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("Menor: " + n2);
        } else if (n3 < n2 && n3 < n1) {
            System.out.println("Menor: " + n3);
        } else {
            System.out.println("existem numeros iguais");
        }
    }
}
