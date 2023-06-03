import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        numeros.add(num1);
        numeros.add(num2);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
