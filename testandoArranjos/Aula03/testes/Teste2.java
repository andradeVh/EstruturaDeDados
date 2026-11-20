public class Teste2 {
    public static void main(String[] args){
        Fila<String> fila = new Fila<>(10);

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.imprimir();
        fila.enfileirar("D");
        fila.enfileirar("E");
        fila.desenfileirar();
        fila.imprimir();
    }
}
