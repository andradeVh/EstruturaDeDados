package Aula03;

public class decToBin {
    static void main() {

        Stack<Integer> pilha = new Stack<>(50);

        int numero = 19;

        while (numero > 0) {
            int resto = numero % 2;
            pilha.push(resto);
            numero /= 2;

        }

        // Desempilhando para formar o binário

        StringBuilder binario = new StringBuilder();
        while (!pilha.isEmpty()) {
            binario.append(pilha.pop());
        }

        System.out.println(binario.toString());
    }
}