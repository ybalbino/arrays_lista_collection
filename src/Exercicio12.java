import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] A = new int[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }

        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int bIndex = 0;
        int cIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[bIndex] = A[i];
                bIndex++;
            } else {
                C[cIndex] = A[i];
                cIndex++;
            }
        }

        B = Arrays.copyOf(B, bIndex); // Redimensionar o vetor B para conter apenas os elementos pares
        C = Arrays.copyOf(C, cIndex); // Redimensionar o vetor C para conter apenas os elementos ímpares

        System.out.println("Usando Arrays:");
        System.out.println("Vetor B (pares): " + Arrays.toString(B));
        System.out.println("Vetor C (ímpares): " + Arrays.toString(C));


    }
}
