package Aula03.src.testes;

import Aula03.src.Pilha;

public class teste1 {
    static void main(){
        Pilha<Integer> pilha = new Pilha<>(5);

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        // inserindo dados
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        // removendo dados
        pilha.pop();
        int valor = pilha.pop();
        System.out.println("Segundo valor desempilhado " + valor);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop(); // tentando desempilhar quando a pilha está vazia
  
    }
}
