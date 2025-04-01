package MatrizesVetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aula7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        list.add(leitura.next());
        list.add(leitura.next());
        list.add(leitura.next());
        list.add(2, leitura.next());

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------------------");
        System.out.println("Digite o nome da pessoa que deseja procurar:");
        System.out.println("Indice: " + list.indexOf(leitura.next()));
        System.out.println("----------------------------------");
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : resultado) {
            System.out.println(x);

            System.out.println("----------------------------------");
            String nome = list.stream().filter(y -> y.charAt(0) == 'J').findFirst().orElse(null);
            System.out.println(nome);
        }
    }
}