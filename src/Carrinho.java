import java.util.Arrays;
import java.util.Objects;

public class Carrinho { // onde são armazenados os itens
    private Item[] itens; //array de itens
    private long dono; // codigo do usuario dono do carrinho


    public Carrinho(long dono) {
        this.dono = dono;
        this.itens = new Item[] {};
    }

    public long getDono() {
        return dono;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public void adicionar_carrinho(Item novo_item) { // adiciona item ao carrinho
        Item[] carrinho = getItens();
        Item[] resultado = new Item[carrinho.length + 1];
        System.arraycopy(carrinho, 0, resultado, 0, carrinho.length);
        resultado[carrinho.length] = novo_item;
        setItens(resultado);
    }

    public void remover_carrinho(Item remover_item) {
        Item[] carrinho = getItens();
        Item[] resultado = new Item[carrinho.length - 1];
        int index = -1;
        for (int i = 0; i < carrinho.length - 1; i++) {
            if (Objects.equals(carrinho[i], remover_item)){
                index = i;
                break;
            }
        }

        if (index >= 0){
            System.arraycopy(carrinho, 0, resultado, 0, index);
            System.arraycopy(carrinho, index + 1, resultado, index, carrinho.length - index - 1);
            setItens(resultado);
        }
    }

    @Override
    public String toString() {
        return "carrinho{" +
                "itens=" + Arrays.toString(itens) +
                '}';
    }
}