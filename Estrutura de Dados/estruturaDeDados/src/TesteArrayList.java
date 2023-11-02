import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList listaDeProdutos = new ArrayList();
        Produto produto1 = new Produto("Celular",1800);
        Produto produto2 = new Produto("Caderno",20);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        //Casting
        Produto celular = (Produto) listaDeProdutos.get(0);
        System.out.println(celular.getName() + " " + celular.getPrice());

    }
}
