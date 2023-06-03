import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        List<Double> salarios = new ArrayList<>();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();
            salarios.add(salario);
        }

        double mediaSalarios = calcularMediaSalarios(salarios);

        System.out.println("Média salarial da empresa: " + mediaSalarios);
    }

    public static double calcularMediaSalarios(List<Double> salarios) {
        double somaSalarios = 0;

        for (double salario : salarios) {
            somaSalarios += salario;
        }

        return somaSalarios / salarios.size();
    }
}
