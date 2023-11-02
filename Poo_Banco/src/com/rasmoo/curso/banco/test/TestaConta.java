package com.rasmoo.curso.banco.test;
import com.rasmoo.curso.banco.model.Cliente;
import com.rasmoo.curso.banco.model.Conta;
import com.rasmoo.curso.banco.model.ContaCorrente;
import com.rasmoo.curso.banco.model.ContaPoupanca;

public class TestaConta {
    public static void main(String[] args) {
         //Instanciei um objeto do tipo conta
            Cliente cliente = new Cliente("Pedro","123456-78");
            Conta primeiraConta = new ContaCorrente(100,1,cliente);
            Conta segundaConta = new ContaPoupanca(200,10,new Cliente("Pedro","123456-78"));
            //Passei os valores dos atributos da conta
            cliente.setProfissao("Programador");
            cliente.setSalarioMensal(2800);
            //Composição entre objetos
            primeiraConta.setTitular(cliente); //Uma conta tem um cliente
            //Uso do static
            System.out.println("Total de contas criadas é: " + Conta.getTotal());
            //imprimindo
            System.out.println( "Agencia : " + primeiraConta.getAgencia() + " numero: " + primeiraConta.getNumero());
            System.out.println("Titular: " + cliente.getNome() + " CPF: " + primeiraConta.getTitular().getCpf());
            System.out.println("Saldo em conta: " + primeiraConta.getSaldo());
            System.out.println("-------------------");
            //Fazendo depósito
            System.out.println("Depositei");
            primeiraConta.depositar(500.0);
            System.out.println("Saldo em conta: "+ primeiraConta.getSaldo());
            System.out.println("-------------------");
            //Fazendo uma transferência
            System.out.println("Saldo da segunda conta: "+ segundaConta.getSaldo());
            System.out.println("transferi");
            System.out.println("-------------------");
            primeiraConta.transferir(100,segundaConta);
            System.out.println("Saldo em conta: "+ primeiraConta.getSaldo());
            System.out.println("Saldo da segunda conta: "+ segundaConta.getSaldo());
            //Modificando ToString
            System.out.println(primeiraConta);
            //Método Abstrato
            primeiraConta.gerarExtrato();
    }
}
