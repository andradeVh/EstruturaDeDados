public class Teste3 {
    static void main(){
        Fila<Pacote> fila = new Fila<>(10);
        Produtor produtor1 = new Produtor("Produtor 1", "PC-A");
        Produtor produtor2 = new Produtor("Produtor 2", "PC-B");

        produtor1.produzirPacote(fila, 1, "Login", "Servidor 1", "Dados do pacote 1");
        produtor2.produzirPacote(fila, 2, "Imagem", "Servidor 2", "Dados do pacote 2");
        produtor1.produzirPacote(fila, 3, "Imagem", "Servidor 3", "Dados do pacote 3");

        System.out.println("FILA DE PACOTES");
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();
    }
}
