import java.util.Date;
import java.util.UUID;
public class Item { // classe mãe de todos os produtos
    private String nome;
    private String codigo; //código aleatório do produto
    private double preco;
    private Date validade; // data de validade

    public Item(String nome, double preco, Date validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
        this.codigo = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double calcularPreco(int imposto) { // retorna o preco com imposto
        return this.preco + ((this.preco / 100) * imposto);
    }
    public double calcularPreco(int imposto, double desconto) { // retorna o preco com desconto
        return this.calcularPreco(imposto) - this.preco * desconto / 100 ;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getValidade() {
        return validade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", validade=" + validade +
                '}';
    }
}
