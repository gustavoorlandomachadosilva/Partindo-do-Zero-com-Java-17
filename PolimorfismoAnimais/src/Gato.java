public class Gato extends Animal implements Estimacao{
    private String raca;

    public Gato(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void EmitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void Locomover() {
        System.out.println("Ando sobre 4 patas");
    }

    @Override
    public void Brincar() {
        System.out.println("Brinco com bolinha de lã");
    }
}
