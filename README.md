Contador de Palavras - Java
Este é um programa simples em Java que conta a frequência de palavras em uma frase fornecida pelo usuário. O objetivo é praticar a manipulação de strings e o uso de estruturas de dados, como Map, para armazenar e contar as palavras.

Funcionalidade
O programa recebe uma frase do usuário.
Remove pontuações e espaços extras da frase.
Conta a frequência de cada palavra na frase.
Exibe o resultado, mostrando a palavra e sua respectiva contagem.
Como usar
Clone o repositório para sua máquina local:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/contador-de-palavras.git
Abra o arquivo Main.java e execute o programa.
O programa pedirá para você digitar uma frase e, em seguida, exibirá a contagem das palavras.

A saída será algo como:

makefile
Copiar
Editar
palavra1: 3
palavra2: 2
palavra3: 1
Exemplo de código
java
Copiar
Editar
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

        frase = frase.replaceAll("[\\p{Punct}\\s]+", " ").trim();

        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : frase.toLowerCase().split(" ")) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }

        contador.forEach((palavra, frequencia) -> {
            System.out.println(palavra + ": " + frequencia);
        });

        scanner.close();
    }
}
Tecnologias usadas
Java 8+
Map (para contagem de palavras)
