import java.util.Date;
public class Alimento extends Item{ //itens alimenticios
    private String marca; //marca do produto
    private long lote;
    private int quantidade; //quantidade de unidades em uma embalagem

    public Alimento(String nome, double preco, Date validade, String marca, long lote, int quantidade) {
        super(nome, preco, validade);
        this.marca = marca;
        this.lote = lote;
        this.quantidade = quantidade;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setLote(long lote){
        this.lote = lote;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String getMarca(){
        return this.marca;
    }
    public long getLote(){
        return this.lote;
    }
    public int getQuantidade(){
        return this.quantidade;
    }


    //quanto mais próximo da validade, mais barato o produto fica
    public double calcularPreco(int imposto){ //calcula o preço líquido
        Date data_atual = new Date();
        if(data_atual.before(super.getValidade())){
            int dias = super.getValidade().getDate() - data_atual.getDate(); //intervalo de tempo entre data atual e validade

            return (this.getPreco() + (this.getPreco() / 100) * imposto )- (this.getPreco()* (((double) dias)*0.01));
        }
        return 0;
    }
    public double calcularPreco(int imposto, double peso){ //calcula o preço líquido de acordo com peso
        return calcularPreco(imposto) * peso;
    }
}