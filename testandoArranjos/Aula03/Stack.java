
// composição ("tem um")
public class Stack<T extends Comparable<T>> {
    private Vetor<T> vetor;

    public Stack(int capacidade) {
        this.vetor = new Vetor<>(capacidade);
    }
    
    public void push(T elemento) {
        vetor.inserir(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        T valor = vetor.ler(vetor.obterTamanho() - 1);
        vetor.remover(vetor.obterTamanho() - 1);
        return valor;
    }

    public boolean isEmpty() {
        return vetor.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return vetor.ler(vetor.obterTamanho() - 1);
    }
}
