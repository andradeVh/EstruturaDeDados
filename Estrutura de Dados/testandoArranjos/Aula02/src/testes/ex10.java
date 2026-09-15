public class ex10 {

    static void main() {
        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1, "Monitor", 500));
        estoque.inserir(new Produto(2, "Teclado", 50));
        estoque.inserir(new Produto(3, "Mouse", 23));

        estoque.imprimir();
    }

}
