import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        List<Integer> numbers = new ArrayList<>();

        for (int[] row : matrix) {
            for (int number : row) {
                numbers.add(number);
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("A soma dos 20 números é: " + sum);
    }
}
