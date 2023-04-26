import java.util.Date;

public class Higienico extends Item{
    private String uso; // nasal, capilar, bocal, etc
    private boolean hipoalergenico; //produtos feitos para não dar alergia, geralmente mais caros
    private boolean toxico; // produtos que podem intoxicar em caso de uso indevido
    public Higienico(String nome, double preco, Date validade, String uso, boolean hipoalergenico, boolean toxico) {
        super(nome, preco, validade);
        this.uso = uso;
        this.hipoalergenico = hipoalergenico;
        this.toxico = toxico;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public boolean getHipoalergenico() {
        return hipoalergenico;
    }

    public boolean getToxico() {
        return toxico;
    }

    @Override
    public String toString() {
        return "Higienico{" +
                "uso='" + uso + '\'' +
                ", hipoalergenico=" + hipoalergenico +
                ", toxico=" + toxico +
                '}';
    }

    public double calcularPreco(){
        if(this.hipoalergenico ==  false){
            return this.getPreco();
        }else{
            return this.getPreco() * 1.2;
        }
    } //o produto é mais caro se for hipoalergenico

    public double calcularPreco(double desconto){
        if(this.hipoalergenico ==  false){
            return this.getPreco() - this.getPreco() * desconto /100;
        }else{
            return (this.getPreco() - this.getPreco() * desconto /100) * 1.2;
        }
    }// o produto é mais caro se for hipoalergenico mas é mais barato se tiver desconto
}
