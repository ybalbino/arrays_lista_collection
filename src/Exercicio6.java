import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean isMultiplo = verificarMultiplo(numero);

        if (isMultiplo) {
            System.out.println(numero + " é um múltiplo de 5 e 7.");
        } else {
            System.out.println(numero + " não é um múltiplo de 5 e 7.");
        }
    }
    public static boolean verificarMultiplo(int numero) {
        List<Integer> multiplos = new ArrayList<>();
        multiplos.add(5);
        multiplos.add(7);

        for (int multiplo : multiplos) {
            if (numero % multiplo != 0) {
                return false;
            }
        }

        return true;
    }
}