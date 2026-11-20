import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Projeto projeto = new Projeto(new Gerente(1, 5000, "João"), "Projeto X", new ArrayList<Funcionario>());

        Funcionario funcionario1 = new Funcionario(2, 3000, "Maria");
        Funcionario funcionario2 = new Funcionario(3, 4000, "Pedro");
        Funcionario funcionario3 = new Funcionario(4, 3500, "Ana");

        projeto.adicionarFuncionario(funcionario1);
        projeto.adicionarFuncionario(funcionario2);
        projeto.adicionarFuncionario(funcionario3);

        projeto.finalizarProjeto();

       System.out.println(projeto.toString());
    
    }
}
