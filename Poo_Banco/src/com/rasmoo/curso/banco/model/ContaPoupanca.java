package com.rasmoo.curso.banco.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("o extrato da conta poupança foi gerado");
    }
}
