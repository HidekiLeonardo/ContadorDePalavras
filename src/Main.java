import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========== Contador de palavras ===========");
        System.out.println("Vamos contar quantas palavras repetidas existe na frase!");
        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

        frase = frase.replaceAll("[\\p{Punct}\\s]+", " ").trim();

        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : frase.toLowerCase().split(" ")) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("\n============================================");

        contador.forEach((palavra, frequencia) -> {
            System.out.println(palavra + ": " + frequencia);
        });

        scanner.close();
    }
}
