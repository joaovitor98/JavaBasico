package OutrosTopicos;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int mask = 0b100000;
        System.out.println("Digite um numero");
        int n = leitura.nextInt();
        if ((n & mask) != 0) {
            System.out.println("O 6º bit é verdadeiro");
        } else {
            System.out.println("O 6º bit é falso");
        }
    }
}
