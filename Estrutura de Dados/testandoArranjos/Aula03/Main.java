

public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
    }
}
