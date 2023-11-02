import java.util.ArrayList;

public class TesteArrayListGenerics {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Celular",1800);
        Produto produto2 = new Produto("Caderno",20);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        System.out.println(listaDeProdutos.get(0).getName() + " " + listaDeProdutos.get(0).getPrice());

    }
}
