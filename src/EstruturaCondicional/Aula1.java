package EstruturaCondicional;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantas horas");
        int horas = leitura.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia");
        } else if (horas < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}