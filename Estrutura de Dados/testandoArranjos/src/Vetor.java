import java.util.Random;

public class Vetor<T> {
    private T elementos[];
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade) {
        elementos = (T[]) new Object[quantidade];
        this.tamanho = 0;
    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }
        elementos[tamanho] = elemento;
        tamanho++;

    }

    public void inserir(int indice, T elemento) {
        if (tamanho >= elementos.length) {
            System.out.println("Vetor cheio");
            return;
        }

        if (indice < 0 || indice > elementos.length) {
            System.out.println("Posição inválida");
            return;
        }

        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[indice] = elemento;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Object[elementos.length * 2];

        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }

        this.elementos = novo;

    }

    public void imprimir() {
        if (tamanho != 0) {
            System.out.print("[");
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] != null) {
                    System.out.print(elementos[i]);
                    if (i < elementos.length - 1) {
                        System.out.print(", ");

                    }
                }
            }
            System.out.println("]");
        }

    }

    public int obterTamanho() {
        return tamanho;
    }

    public T ler(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (tamanho <= elementos.length / 4) {
            T[] novo = (T[]) new String[elementos.length / 2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }

    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();

    }

    public int buscaLinear(Vetor<Integer> vetor, int alvo) {
        for (int i = 0; i < vetor.obterTamanho(); i++) {
            if (vetor.ler(i) == alvo) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public int buscaLinearOrdenada(Vetor<Integer> vetor, int alvo) {
        int contador = 0;
        for (int i = 0; i < vetor.obterTamanho(); i++) {
            contador++;
            if (vetor.ler(i) == alvo) {
                // System.out.println(i);
                System.out.println("Número de comparações (Linear): " + contador);
                return i;
            } else if (vetor.ler(i) > alvo) {
                return -1;
            }
        }
        return -1;
    }

    public int buscaBinaria(Vetor<Integer> vetor, int alvo) {
        int contador = 0;
        int inicio = 0;
        int fim = vetor.obterTamanho() - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim)/2;
            contador++;
            if (vetor.ler(meio) == alvo) {
                System.out.println("Número de comparações (Binária): " + contador);
                return meio;
            }  else if (vetor.ler(meio) > alvo) {
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public int menorValor(int a, int b){
        return (a > b) ? b : a;
    }

    public int buscaFibonacci(Vetor<Integer> vetor, int alvo){
        int a, b;
        a = 1;
        b = 1;

        for (int i = 2; i <= alvo; i++ ){

        }

        return -1;
    }

    public int buscarValor(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] != null && elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public void inserirAleatorio(int valores, int range) {
        int valorAleatorio = 0;
        Random random = new Random();

        for (int i = 0; i < valores; i++) {
            valorAleatorio = random.nextInt(range);

            if (buscarValor((T) Integer.valueOf(valorAleatorio)) != -1) {
                i--;
            }

            else {

                if (tamanho == 0) {
                    inserir(0, (T) Integer.valueOf(valorAleatorio));
                } else {
                    int tamanhoAtual = tamanho;
                    int j;

                    for (j = 0; j < tamanhoAtual; j++) {
                        if (elementos[j] != null && valorAleatorio < (Integer) elementos[j]) {
                            inserir(j, (T) Integer.valueOf(valorAleatorio));
                            break;
                        }

                    }
                    if (j == tamanhoAtual) {
                        inserir(tamanhoAtual, (T) Integer.valueOf(valorAleatorio));
                    }
                }
            }
        }
    }

}
