public class Pilha<T extends Comparable<T>> {
    private int topo;
    private T[] elementos;

    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        this.elementos = (T[]) new Comparable[capacidade];
        this.topo = -1;
    }

    public void push(T elemento) {
        elementos[++topo] = elemento;
    }

    public T pop() {

        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }

        T elemento = elementos[topo];
        elementos[topo--] = null;
        return elemento;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

}