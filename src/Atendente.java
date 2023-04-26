import java.util.Date;

public class Atendente extends Usuario{
    private String cargo;
    private double salario;
    private int cargaHoraria;


    public Atendente(long cpf, String nome, long telefone, Date dataNascimento, String cargo, double salario, int cargaHoraria) {
        super(cpf, nome, telefone , dataNascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public Atendente(long cpf, String nome, Date dataNascimento, String cargo, double salario, int cargaHoraria) {
        super(cpf, nome, dataNascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String fazerAniversario(){
        Date diaHoje = new Date();
        String diaHojeReal = diaHoje.getMonth() + 1 + "/" + diaHoje.getDate();
        String aniversComparacao = this.getDataNascimento().getMonth() + 1 + "/" + this.getDataNascimento().getDate();
        if (aniversComparacao.equals(diaHojeReal)) {
            double novoSalario = this.salario + (this.salario / 100) * 15;
            return "O salario deste mês dele é: " + novoSalario;
        }
        return "Hoje não é o seu aniversário";
    }

    @Override
    public String toString() {
        return
                "O atendente " + this.getNome() + " tem carga horária de: " + this.cargaHoraria
                        + " , salario de: " + this.salario + " e cargo de "
                        + this.cargo;
    }
}