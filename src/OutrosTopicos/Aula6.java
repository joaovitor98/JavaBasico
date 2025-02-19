package OutrosTopicos;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o numero de inicio");
        int n1 = leitura.nextInt();
        System.out.println("Digite o numero de fim");
        int n2 = leitura.nextInt();
        System.out.println("Abaixo tera a contagem");
        System.out.print(contador(n1, n2));
    }

    public static String contador(int i, int f) {
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + "";
        }
        return s;
    }
}
