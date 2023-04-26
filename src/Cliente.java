import java.util.Date;

public class Cliente extends Usuario{
    private boolean especial;
    private double gasto;

    public Cliente(long cpf, String nome, long telefone, Date dataNascimento, boolean especial, double gasto) {
        super(cpf, nome ,telefone, dataNascimento);
        this.especial = especial;
        this.gasto = gasto;
    }

    public Cliente(long cpf, String nome, Date dataNascimento, boolean especial, double gasto) {
        super(cpf, nome, dataNascimento);
        this.especial = especial;
        this.gasto = gasto;
    }

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public String fazerAniversario(){
        Date diaHoje = new Date();
        String diaHojeReal = diaHoje.getMonth() + 1 + "/" + diaHoje.getDate();
        String aniversComparacao = this.getDataNascimento().getMonth() + 1 + "/" + this.getDataNascimento().getDate();
        if (aniversComparacao.equals(diaHojeReal)){
            if(this.especial == true && this.gasto > 1000){
                double desconto = 1;
                if(gasto > 1500){
                    desconto = 2;
                } else if (gasto > 3000) {
                    desconto = 5;
                }
                return "Parabéns por ser seu aniversário e você ser um cliente muito especial te daremos o desconte de "
                        + desconto + "%";
            }
            else {
                return "Parabens" + getNome();
            }
        }
        return "Hoje não é seu aniversario";
    }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() +
                "especial=" + especial +
                ", gasto=" + gasto +
                '}';
    }
}