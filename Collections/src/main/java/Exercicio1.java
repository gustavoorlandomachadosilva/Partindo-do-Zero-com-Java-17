import java.util.*;

public class Exercicio1 {
    public static void main(String [] args){
        System.out.println("Crie uma lista e adicione 3 numeros");
        List <Integer> valores = new ArrayList<Integer>();
        valores.add(1);
        valores.add(10);
        valores.add(100);
        System.out.println(valores);
        //Tamanho da lista
        System.out.println("Qual o tamanho da lista? : " + valores.size());
        //Descobrindo posição
        System.out.println("Em qual posição está o valor 100? : " + valores.indexOf(100));
        //set posição e elemento na lista
        System.out.println("Adicionando valores...");
        valores.add(2,200);
        System.out.println(valores);
        //trocando valores na posição
        System.out.println("Mudando valor da posição 2...");
        valores.set(2,50);
        System.out.println(valores);
        //Pegando valor de uma posição
        System.out.println("Qual o Valor da posição 2 ? : " + valores.get(2));
        //Fazendo pesquisa na lista
        System.out.println("Existe o valor 10 na lista? : " + valores.contains(10));
        //Removendo valores
        valores.remove(2);
        System.out.println("Após remoção do elemento da posição 2: "+ valores);
        //Maior e menor valor
        System.out.println("Qual o menor elemento e o maior elemento ? : " + Collections.min(valores) + "," + Collections.max(valores));
        //Método somando
        int somaArmazenada = 0;
        Iterator<Integer> iterator = valores.iterator();
        while (iterator.hasNext()){
            int proximoValor = iterator.next();
            somaArmazenada = somaArmazenada + proximoValor;
        }
        System.out.println("O resultado da soma dos itens da lista é : " + somaArmazenada);
        System.out.println("Média da lista é: " + (somaArmazenada/valores.size()));
        System.out.println("********************************");

        LinkedList<Integer> valores2 = new LinkedList<Integer>();
        valores2.addAll(valores);
        System.out.println("Valores da lista2 : " + valores2);
        System.out.println("O primeiro valor da lista é : " + valores2.getFirst());
        System.out.println("Removendo o primeiro valor...");
        valores2.removeFirst();
        System.out.println("Lista atualizada: " + valores2);
    }
}
