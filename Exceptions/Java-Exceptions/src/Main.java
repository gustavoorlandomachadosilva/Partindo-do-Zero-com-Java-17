public class Main {
    public static void main(String[] args) {
        try{
            int divisao = 10/2;
            System.out.println("resultado: " + divisao);

            Cliente gustavo = new Cliente("gustavo orlando","708554987");
            Conta conta = new Conta(10,21,gustavo);
            conta.depositar(1000);
            conta.sacar(1500);
            System.out.println("Saldo da conta" + conta.getSaldo());

        /*Por AirthmeticException e nullPointer exception serem herdados de "RuntimeException",
        podemos utilizar esta classe para englobar os outros tipos de exceção, é uma exceção mais genérica*/
        }catch(RuntimeException ex){
            System.out.println("Causa do erro: " + ex.getMessage());
        }
        finally {
            System.out.println("Sempre sou executado");
        }
        System.out.println("Agora sou chamado");

    }
}