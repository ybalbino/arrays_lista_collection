import java.util.ArrayList;
import java.util.List;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> impares = new ArrayList<>();

        for (int numero : vetorA) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        int soma = 0;
        for (int numero : impares) {
            soma += numero;
        }

        double media = (double) soma / impares.size();

        System.out.println("A média aritmética dos elementos ímpares é: " + media);
    }
}