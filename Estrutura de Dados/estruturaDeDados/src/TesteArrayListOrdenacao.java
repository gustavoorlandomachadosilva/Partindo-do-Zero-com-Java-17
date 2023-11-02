import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListOrdenacao {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Ana");
        nomes.add("Lukas");
        nomes.add("Nayara");
        Collections.sort(nomes);
        //Segunda forma
        for (String nome:nomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------");
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Caderno",30);
        Produto produto2 = new Produto("Lapis",5);
        Produto produto3 = new Produto("Camisa",80);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        //Collections.sort(produtos);
        Collections.sort(produtos, new ProdutoOrdenacaoComparator());
        for(Produto produto: produtos){
            System.out.println("Nome: " + produto.getName() + "| Preço: " + produto.getPrice());
        }

    }
}

 class ProdutoOrdenacaoComparator implements Comparator<Produto> {

     @Override
     public int compare(Produto p1, Produto p2) {
         /*if (p1.getPrice() > p2.getPrice()){
             return 1;
         }
         if (p1.getPrice() < p2.getPrice()){
             return -1;
         }
         return 0;*/
        return p1.getPrice() - p2.getPrice();
     }
 }
