public class ex14 {
    static void main() {
        Vetor<Integer> vetor1000 = new Vetor<Integer>(1000);
        Vetor<Integer> vetor10000 = new Vetor<Integer>(10000);
        Vetor<Integer> vetor100000 = new Vetor<Integer>(100000);

        long inicio = System.nanoTime();

        vetor1000.inserirAleatorio(1000);

        long fim = System.nanoTime();
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        inicio = System.nanoTime();

        vetor10000.inserirAleatorio(10000);

        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        inicio = System.nanoTime();

        vetor100000.inserirAleatorio(100000);

        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");
    }
}
