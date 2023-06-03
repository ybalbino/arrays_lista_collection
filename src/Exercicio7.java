import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        List<Integer> digitos = obterDigitos(numero);

        Collections.reverse(digitos);

        System.out.print("Número invertido: ");
        for (int digito : digitos) {
            System.out.print(digito);
        }
    }
    public static List<Integer> obterDigitos(int numero) {
        List<Integer> digitos = new ArrayList<>();

        while (numero > 0) {
            int digito = numero % 10;
            digitos.add(digito);
            numero /= 10;
        }

        return digitos;
    }
}