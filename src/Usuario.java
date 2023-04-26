import java.util.Date;

public class Usuario {
    private long cpf;
    private String nome;
    private long telefone;
    private Date dataNascimento;
    public Usuario(long cpf, String nome, long telefone, Date dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Usuario(long cpf, String nome, Date dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public long getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int idade) {
        this.telefone = idade;
    }


    public String fazerAniversario(){
        Date diaHoje = new Date();
        String diaHojeReal = diaHoje.getMonth() + 1 + "/" + diaHoje.getDate();
        String aniversComparacao = this.dataNascimento.getMonth() + 1 + "/" + this.dataNascimento.getDate();
        if (aniversComparacao.equals(diaHojeReal)){
            return "Hoje é seu aniversaio " + nome;

        }

        return "Hoje não é seu aniversário";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}