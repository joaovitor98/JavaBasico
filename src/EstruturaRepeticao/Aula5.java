package EstruturaRepeticao;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        int n;
        int s = 0;
        char resp;
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("Digite um numero");
            n = leitura.nextInt();
            s += n;
            System.out.println("Quer continuar? (S/N");
            resp = leitura.next().charAt(0);
        } while (resp == 's');
        System.out.println("A soma de todos os valores é " + s);
    }
}