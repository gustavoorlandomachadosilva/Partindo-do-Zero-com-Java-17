public class ArrayReferencia {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];
        produtos[0] = new Produto("Celular",1800);
        produtos[1] = new Produto("Bicicleta",1000);
        //produto[2] é null, por referência
        for (int i = 0; i < produtos.length;i++){
            System.out.println(produtos[i].getName() + " | " + produtos[i].getPrice());
        }
    }
}
