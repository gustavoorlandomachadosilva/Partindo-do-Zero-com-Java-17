public class Cachorro extends Animal implements Estimacao {
    private String porte;
    private String raça;

    public Cachorro(String porte, String raça) {
        this.porte = porte;
        this.raça = raça;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    //Métodos
    @Override
    public void EmitirSom() {
        System.out.println("AuAu");
    }

    @Override
    public void Locomover() {
        System.out.println("Ando sobre 4 patas");
    }

    @Override
    public void Brincar() {
        System.out.println("Brinco com bolinha de Tênis");
    }
}
