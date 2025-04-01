package OutrosTopicos;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite três numeros");
        int x = leitura.nextInt();
        int y = leitura.nextInt();
        int z = leitura.nextInt();

        int maior = max(x, y, z);

        showResult(maior);
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Maior: " + value);
    }
}
