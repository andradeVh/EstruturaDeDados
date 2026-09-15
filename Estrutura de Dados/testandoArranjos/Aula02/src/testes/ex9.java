public class ex9 {
    static void main(){
        Caixa<String> caixaTexto = new Caixa<>();

        caixaTexto.guardar("Olá mundo");
        System.out.println(caixaTexto.abrir());
        caixaTexto.guardar("oiie");
        System.out.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa();
        caixaNumero.guardar(222);
        System.out.println(caixaNumero.abrir());
    }
}
