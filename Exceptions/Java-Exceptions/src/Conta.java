public class Conta {
    //attributes
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int total;

    //Constructor
    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        total++;
    }
    //void method
     void depositar(double valor){
         this.saldo += valor;
    }
    //Method with return
    public void sacar(double valor){
        if (this.saldo < valor){
           /*primeira forma
            ArithmeticException arithmeticException = new ArithmeticException("Aconteceu um erro");
            throw arithmeticException;
            */
            throw new saldoInsuficienteException("Saldo insuficiente"); //Modo mais usual
        }
        this.saldo -= valor;
    }
    //Method with reference
    void transferir(double valor, Conta contaDestino){
         this.sacar(valor);
         contaDestino.depositar(valor);

    }
    //Getters and Setters
    public double getSaldo(){
         return this.saldo;
    }
    //Não criei o setter, pois não é interessante mudarem os valores do saldo, apenas exibi-los
    public int getAgencia(){
         return this.agencia;
    }
    public void setAgencia(int agencia){
         if (agencia > 0){
             this.agencia = agencia;
         }
    }
    public int getNumero(){
         return  this.numero;
    }
    public void setNumero(int numero){
         this.numero = numero;
    }
    public Cliente getTitular() {
        return this.titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public static int getTotal() {
        return total;
    }

    //Sobreescrevendo Method ToString da classe Object
    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }


}
