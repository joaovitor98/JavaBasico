package ExVetores;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Número de quartos que serão alugados: ");
        int n = leitura.nextInt();
        int quarto[] = new int[n];
        String nome[] = new String[n];
        String email[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            leitura.nextLine();
            nome[i] = leitura.nextLine();
            System.out.print("E-mail: ");
            email[i] = leitura.next();
            System.out.print("Quarto: ");
            quarto[i] = leitura.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (quarto[i] <= 10) {
                System.out.printf("%nQuartos ocupados%n%d: %s, %s%n", quarto[i], nome[i], email[i]);
            }
        }
    }
}
