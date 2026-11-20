public class Fila<T extends Comparable> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Fila(int quantidade) {
        elementos = (T[]) new Comparable[quantidade];
        this.tamanho = 0;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Fila cheia");
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public T frente() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return elementos[0];
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    

}