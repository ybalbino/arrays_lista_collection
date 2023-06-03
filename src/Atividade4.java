import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 10;
        double[] alturas = new double[quantidadePessoas];
        char[] sexos = new char[quantidadePessoas];
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaHomens = 0;
        int quantidadeMulheres = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Altura (em metros): ");
            alturas[i] = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            sexos[i] = scanner.next().charAt(0);

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            if (sexos[i] == 'M' || sexos[i] == 'm') {
                somaAlturaHomens += alturas[i];
            } else if (sexos[i] == 'F' || sexos[i] == 'f') {
                quantidadeMulheres++;
            }
        }

        double mediaAlturaHomens = somaAlturaHomens / (quantidadePessoas - quantidadeMulheres);

        System.out.printf("Maior altura do grupo: %.2f metros\n", maiorAltura);
        System.out.printf("Menor altura do grupo: %.2f metros\n", menorAltura);
        System.out.printf("Média de altura dos homens: %.2f metros\n", mediaAlturaHomens);
        System.out.println("Número de mulheres: " + quantidadeMulheres);
    }
}
