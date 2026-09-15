public class ex6 {
    static void main(){

        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        // expandir
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        //expandir
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");

        vetor.imprimir();

        vetor.remover(1);
        vetor.imprimir();
    }
}
