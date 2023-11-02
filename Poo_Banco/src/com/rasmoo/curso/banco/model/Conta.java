package com.rasmoo.curso.banco.model;

public abstract class Conta {
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
    public void depositar(double valor){
         this.saldo += valor;
    }
    //Method with return
    boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    //Method with reference
     public void transferir(double valor, Conta contaDestino){
        boolean conseguiuSacar = this.sacar(valor);
        if (conseguiuSacar){
            contaDestino.depositar(valor);
        }
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
        return "com.rasmoo.curso.banco.model.model.Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
    //Estou obrigado as classes filhas a implementarem este método
    public abstract void gerarExtrato();

}
