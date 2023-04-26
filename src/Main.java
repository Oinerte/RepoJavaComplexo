import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Item1", 15, new Date());
        System.out.println(item1);
        System.out.println(item1.calcularPreco(5));
        System.out.println(item1.calcularPreco(5, 10.20));

        Higienico higienico1 = new Higienico("Higienico1", 10, new Date(), "nasal", false, false);
        System.out.println(higienico1);
        System.out.println(higienico1.calcularPreco(5));
        System.out.println(higienico1.calcularPreco(5, 50.10));

        Higienico higienico2 = new Higienico("Higienico2", 10, new Date(), "nasal", true, false);
        System.out.println(higienico2);
        System.out.println(higienico2.calcularPreco(2));
        System.out.println(higienico2.calcularPreco(2, 50.20));

        Alimento alim1 = new Alimento("alim1", 12, new Date("2025/01/01"), "luiviton", 1234567l, 5);
        System.out.println(alim1);
        System.out.println(alim1.calcularPreco(2, 10.50));
        System.out.println(alim1.calcularPreco(2));

        Atendente at1 = new Atendente(11122233344L, "Diogo", 123456789L, new Date("4/14/2007"), "Estgiário", 600, 20);
        Atendente at2 = new Atendente(11122233344L, "Tutu", 123456789L, new Date("3/28/2007"), "Estgiário", 600, 20);

        Usuario user1 = new Usuario(1112223334L, "Lauro", new Date("6/17/2007"));
        Usuario user2 = new Usuario(1112223334L, "Gusta", 11122235467L , new Date("6/17/2007"));

        Cliente clt1 = new Cliente(11122233344L, "Diogo", 123456789L, new Date("4/14/2007"), true, 1560);
        Cliente clt2 = new Cliente(11122233344L, "Henrique",new Date("3/28/2007"), true, 1560);

        System.out.println(at2.fazerAniversario());
        System.out.println(clt2.fazerAniversario());
        System.out.println(user1.fazerAniversario());

        Carrinho carr1 = new Carrinho(user2.getCpf());
        carr1.adicionar_carrinho(item1);
        carr1.adicionar_carrinho(higienico1);
        carr1.adicionar_carrinho(higienico2);
        System.out.println(carr1);
        carr1.remover_carrinho(higienico1);
        System.out.println(carr1);
    }
}