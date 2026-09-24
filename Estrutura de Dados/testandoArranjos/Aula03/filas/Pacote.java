public class Pacote implements Comparable<Pacote> {
    private int numero;
    private String origem;
    private String destino;
    private String dados;

    public Pacote(int numero, String origem, String destino, String dados) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.dados = dados;
    }

    public String toString() {
        return "Pacote{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dados='" + dados + '\'' +
                '}';
    }

    public int compareTo(Pacote outro) {
        return Integer.compare(this.numero, outro.numero);
    }
}
