package com.rasmoo.curso.banco.model;


public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }
    //Sobreescrevendo método da superClasse - @Override
    @Override
    boolean sacar(double valor) {
        double taxaDeSaque = 2;
        double novoValor = valor + taxaDeSaque;
        return super.sacar(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("O extrato da conta corrente foi gerado");
    }
}
