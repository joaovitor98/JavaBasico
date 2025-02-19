package ExEstruturaCondicional;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite quantas horas são");
        int hora = leitura.nextInt();
        if (hora >= 0 && hora <= 11) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Tarde");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Noite");
        } else {
            System.out.println("Hora invalida");
        }
    }
}
