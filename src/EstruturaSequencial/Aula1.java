package EstruturaSequencial;

import java.util.Locale;

public class Aula1 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        int idade = 30;
        int cod = 5290;
        char sexo = 'F';

        double preco1 = 2100.00;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.printf(
                "Produtos:%nComputador, cujo preço é %.2f%nMesa de Escritório, cujo preço é %.2f%n%n"
                        + "Registro: %d anos, código %d e sexo %s%n%n"
                        + "Medida com oito casas decimais: %.8f%nArredondado (três casas decimais): %.3f%n",
                preco1, preco2, idade, cod, sexo, medida, medida);

        Locale.setDefault(Locale.US);

        System.out.printf("Ponto decimal americano: %.3f", medida);
    }
}
