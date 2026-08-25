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
        T[] novo = (T[]) new String[elementos.length * 2];

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

    public int buscarLinear(Vetor<Integer> vetor, int alvo) {
        for (int i = 0; i < vetor.obterTamanho(); i++) {
            if (vetor.ler(i) == alvo) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public int buscarLinearOrdenada(Vetor<Integer> vetor, int alvo) {
        for (int i = 0; i < vetor.obterTamanho(); i++) {
            if (vetor.ler(i) == alvo) {
                System.out.println(i);
                return i;
            } else if (vetor.ler(i) > alvo) {
                return -1;
            }
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
    public void inserirAleatorio(int valores) {
        int valorAleatorio = 0;
        Random random = new Random();

        for (int i = 0; i < valores; i++) {
            valorAleatorio = random.nextInt(100000);

            if (buscarValor((T) Integer.valueOf(valorAleatorio)) != -1) {
                i--;
            }

            else {

                if (tamanho == 0) {
                    inserir(0, (T) Integer.valueOf(valorAleatorio));
                } else {
                    int tamanhoAtual = tamanho;
                    for (int j = 0; j < tamanhoAtual; j++) {
                        if (elementos[j] != null) {

                            if (valorAleatorio < (Integer) elementos[j]) {
                                inserir(j, (T) Integer.valueOf(valorAleatorio));
                                break;
                            }

                            if (j == tamanho - 1 && valorAleatorio > (Integer) elementos[j]) {
                                inserir(tamanho, (T) Integer.valueOf(valorAleatorio));
                                break;
                            }

                        }

                    }
                }
            }
        }
    }
}
