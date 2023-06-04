import java.util.ArrayList;
import java.util.List;
public class Exercicio2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int elementInsert = 10;
        int position = 2;

        System.out.println("Lista original: " + list);

        insertElement(list, elementInsert, position);

        System.out.println("Lista modificada: " + list);
    }
    public static void insertElement(List<Integer> list, int element, int position) {
        list.add(position, element);
    }
}
