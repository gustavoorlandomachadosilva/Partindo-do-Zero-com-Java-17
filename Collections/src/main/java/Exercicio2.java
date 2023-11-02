import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> letras = new ArrayList<String>();
        letras.add("B");
        letras.add("C");
        letras.add("A");
        System.out.println(letras);
        System.out.println("Colocando em ordem...");
        Collections.sort(letras);
        System.out.println(letras);
        System.out.println("Colocando em ordem reversa...");
        Collections.reverse(letras);
        System.out.println(letras);
    }

}
