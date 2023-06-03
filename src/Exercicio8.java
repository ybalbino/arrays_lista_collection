import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 100; i <= 150; i++) {
            if (isSumOfDigitsEven(i)) {
                numbers.add(i);
            }
        }

        Collections.sort(numbers);

        System.out.println("Números no intervalo 100-150 com soma de dígitos par:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    private static boolean isSumOfDigitsEven(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum % 2 == 0;
    }
}
