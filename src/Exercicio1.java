import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementRemove = 3;

        System.out.println("Array original: " + Arrays.toString(array));

        int[] newArray = removeElement(array, elementRemove);

        System.out.println("Array modificado: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int element) {

        boolean found = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            return newArray;
        } else {
            return array;
        }
    }
}
