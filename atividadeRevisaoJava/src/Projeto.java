import java.util.ArrayList;

public class Projeto {
    private Gerente gerente;
    private String nomeProjeto;
    private ArrayList<Funcionario> funcionarios;
    private double custoTotal = 0;
    private boolean projetoFinalizado = false;

    public Projeto(Gerente gerente, String nomeProjeto, ArrayList<Funcionario> funcionarios) {
        this.gerente = gerente;
        this.nomeProjeto = nomeProjeto;
        this.funcionarios = funcionarios;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

    public String getNomeProjeto() {
        return this.nomeProjeto;
    }

    public double calcularCustoTotal() {
        calcularBonusGerente();
        custoTotal = gerente.getSalarioFinal();

        for (Funcionario funcionario : funcionarios) {
            if (projetoFinalizado) {
                funcionario.setBonus(funcionario.getSalario() * 0.1);
            }
            custoTotal += funcionario.getSalarioFinal();
        }
        return custoTotal;
    }

    public int qtdFuncionarios() {
        return funcionarios.size();
    }

    public boolean finalizarProjeto() {
        this.projetoFinalizado = true;
        return this.projetoFinalizado;
    }

    public double calcularBonusGerente() {
        double salario = gerente.getSalario();
        double bonus;

        if (projetoFinalizado) {
            bonus = salario * 0.1 * (qtdFuncionarios() + 1);
        } else {
            bonus = salario * 0.1 * qtdFuncionarios();
        }

        this.gerente.setBonus(bonus);
        return bonus;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public String toString() {
        calcularBonusGerente();
        calcularCustoTotal();

        String info = "Projeto: " + nomeProjeto + "\n";
        info += "Gerente: " + gerente.getNome() + "\n";
        info += "Salario do gerente: " + gerente.getSalarioFinal() + "\n";
        info += "Funcionarios: \n";
        for (Funcionario funcionario : funcionarios) {
            info += funcionario.getNome() + "\n";
            info += "Salario: " + funcionario.getSalarioFinal() + "\n";
        }
        info += "Custo Total: " + calcularCustoTotal() + "\n";
        return info;
    }
}