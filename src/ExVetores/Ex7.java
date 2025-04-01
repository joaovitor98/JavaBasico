package ExVetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> nome = new ArrayList<Integer>();
        Scanner leitura = new Scanner(System.in);
        nome.add(leitura.nextInt());
        nome.add(leitura.nextInt());
        nome.add(leitura.nextInt());

        
        for (int nomes: nome){
            System.out.println(nomes);
        }
    }
}
