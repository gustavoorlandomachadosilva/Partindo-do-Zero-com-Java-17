public class Main {
    public static void main(String[] args) {
        //metodo principal
        Cachorro bolinha = new Cachorro ( "Grande","Dalmáta");
        Gato milk = new Gato("Persa");
        System.out.println("Sou um "+ bolinha.getRaça());
        bolinha.Locomover();
        bolinha.EmitirSom();
        bolinha.Brincar();
        System.out.println("Sou um " + milk.getRaca());
        milk.Brincar();
        milk.Locomover();
        milk.EmitirSom();
    }
}