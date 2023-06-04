import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atividade11 {

    public static void main(String[] args) {
        int[] idades = new int[]{25, 18, 30, 42, 21, 36, 50, 28, 33, 45};

        List<Integer> idadesList = new ArrayList<>();
        for (int idade : idades) {
            idadesList.add(idade);
        }

        Integer menorIdadeList = Collections.min(idadesList);
        Integer maiorIdadeList = Collections.max(idadesList);
        int posicaoMenorIdadeList = idadesList.indexOf(menorIdadeList);
        int posicaoMaiorIdadeList = idadesList.indexOf(maiorIdadeList);

        System.out.println("\nUsando List e Collections:");
        System.out.println("Menor idade: " + menorIdadeList + " (Posição: " + posicaoMenorIdadeList + ")");
        System.out.println("Maior idade: " + maiorIdadeList + " (Posição: " + posicaoMaiorIdadeList + ")");
    }
}