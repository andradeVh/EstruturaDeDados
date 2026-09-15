public class VetorDeListas<T> {
    private VetorEstatico<T>[] nomesporletra;

    @SuppressWarnings("unchecked")
    public VetorDeListas() {
        nomesporletra = (VetorEstatico<T>[]) new VetorEstatico[26];
        for (int i = 0; i < nomesporletra.length; i++){
            nomesporletra[i] = new VetorEstatico<T>(20);
        }
    }

    public void inserir(T nome){
        // if tamanho < bla bla
        char letra = Character.toUpperCase(nome.toString().charAt(0));
        int indice = letra - 'A';

        nomesporletra[indice].inserir(nome);

    }

    public void imprimir(){
        for (int i = 0; i < 26; i++){
            char letra = (char) ('A' + i);
            System.out.print(letra + " ");
            nomesporletra[i].imprimir();
        }
    }
}