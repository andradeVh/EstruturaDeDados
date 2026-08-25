import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // relatorio de teste de tempo buscaOrdenada vs BuscaBinaria

        System.out.println("Quantos vetores você deseja criar?");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Qual o tamanho do " + (i + 1) + " vetor?");
            int tamanho = scanner.nextInt();

            Vetor<Integer> vetor = new Vetor<Integer>(tamanho);

            System.out.println("Vetor com " + tamanho + " elementos");
            System.out.println("Preenchendo vetor com " + tamanho + " elementos aleatórios");
            vetor.inserirAleatorio(tamanho, 2000000);
            System.out.println("Vetor preenchido");

            int qtd = vetor.obterTamanho();
            int valorInicio = vetor.ler(0);
            int valorMeio = vetor.ler(qtd / 2);
            int valorFim = vetor.ler(qtd - 1);

            // Busca Linear Ordenada && Buscar Binária
            testarPosicao(vetor, valorInicio, "Início");
            testarPosicao(vetor, valorMeio, "Meio");
            testarPosicao(vetor, valorFim, "Fim");

            // array nativo

            int[] arrayNativo = new int[tamanho];
            preencherArray(arrayNativo);
            valorInicio = arrayNativo[0];
            valorMeio = arrayNativo[tamanho / 2];
            valorFim = arrayNativo[tamanho - 1];
            testarPosicaoArrayNativo(arrayNativo, valorInicio, "Início");
            testarPosicaoArrayNativo(arrayNativo, valorMeio, "Meio");
            testarPosicaoArrayNativo(arrayNativo, valorFim, "Fim");

        }

        scanner.close();
    }

    public static void testarPosicao(Vetor<Integer> vetor, int posicao, String NomePosicao) {
        System.out.println("\n--- Testando posição: " + NomePosicao + " ---");
        // Busca Linear Ordenada
        long inicioLinear = System.nanoTime();
        vetor.buscaLinearOrdenada(vetor, posicao);
        long fimLinear = System.nanoTime();
        long duracaoLinear = fimLinear - inicioLinear;

        // Busca Binária
        long inicioBinaria = System.nanoTime();
        vetor.buscaBinaria(vetor, posicao);
        long fimBinaria = System.nanoTime();
        long duracaoBinaria = fimBinaria - inicioBinaria;

        System.out.println("Tempo de busca linear ordenada: " + duracaoLinear + " ns");
        System.out.println("Tempo de busca binária: " + duracaoBinaria + " ns");
        System.out.println(
                "Melhor método: " + (duracaoLinear < duracaoBinaria ? "Busca Linear Ordenada" : "Busca Binária"));
        System.out.println("----------------------------------------");

    }

    public static void testarPosicaoArrayNativo(int[] vetor, int posicao, String nomePosicao) {
        System.out.println("\n--- Testando posição (Array Nativo): " + nomePosicao + " ---");
        // Arrays.binarySearch()
        long inicioBinarySearch = System.nanoTime();
        int pos = Arrays.binarySearch(vetor, posicao);
        long fimBinarySearch = System.nanoTime();
        long duracaoBinarySearch = fimBinarySearch - inicioBinarySearch;

        System.out.println("Tempo de Arrays.binarySearch: " + duracaoBinarySearch + " ns");
        System.out.println("Posição encontrada: " + pos);
        System.out.println("----------------------------------------");
    }

    public static void preencherArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2000000);
        }

        Arrays.sort(array);
    }
}
