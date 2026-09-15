package Aula03.src;

import Aula02.src.Vetor;
// composição ("tem um")
public class Stack<T extends Comparable<T>> {
    private Vetor<T> vetor;

    public Stack(int capacidade) {
        this.vetor = new Vetor<>(capacidade);
    }
    
    public void push(T elemento) {
        vetor.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        T valor = vetor.get(vetor.size() - 1);
        vetor.remove(vetor.size() - 1);
        return valor;
    }

    public boolean isEmpty() {
        return vetor.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return vetor.get(vetor.size() - 1);
    }
}
