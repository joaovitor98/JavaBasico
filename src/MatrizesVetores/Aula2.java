package MatrizesVetores;

public class Aula2 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i : vetor) {
            System.out.println(vetor[i]++);
        }
    }
}
