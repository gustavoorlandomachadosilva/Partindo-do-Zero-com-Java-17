public class Produto implements Comparable<Produto>{
    private String name;
    private int price;

    public Produto(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        //Casting
        Produto produto = (Produto) obj;
        if (this.name == produto.getName()){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.name.compareTo(outroProduto.getName());
    }
}
