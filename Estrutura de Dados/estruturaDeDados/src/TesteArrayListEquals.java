import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Celular",1800);
        Produto produto2 = new Produto("Caderno",20);
        Produto produto3 = new Produto("Caderno",20);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println(listaDeProdutos.indexOf(produto3));
        System.out.println(listaDeProdutos.contains(produto3));

        if (produto2.equals(produto3)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

    }
}
