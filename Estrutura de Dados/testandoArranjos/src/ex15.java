public class ex15 {
    static void main() {
        Vetor<Integer> vetor = new Vetor<>(1000);

        vetor.inserirAleatorio(100, 1000);
        vetor.imprimir();

        long inicioFib = System.nanoTime();
        vetor.buscaFibonacci(vetor, 0);
        long fimFib = System.nanoTime();
        long duracaoFib = fimFib - inicioFib;

        System.out.println("Duração da busca Fibonacci: " + duracaoFib + " nanosegundos");
    }

}
