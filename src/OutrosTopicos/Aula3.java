package OutrosTopicos;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digte 4 palavras");
        String texto = leitura.nextLine();

        String[] vect = texto.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
