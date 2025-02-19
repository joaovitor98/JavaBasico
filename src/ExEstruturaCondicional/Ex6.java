package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma letra");
        char letra = leitura.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
