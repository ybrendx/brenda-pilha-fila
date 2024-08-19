import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista de strings
        List<String> lista = new ArrayList<>();
        lista.add("vitoria");
        lista.add("Daniel");
        lista.add("rafael");
        lista.add("vanessa");
        lista.add("Celine");
        lista.add("Sandra");

        // Imprimir o tamanho da lista
        System.out.println("Tem: " + lista.size());

        // Imprimir os elementos nos índices 2 e 3
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        // Imprimir o índice do elemento "Daniel"
        System.out.println(lista.indexOf("Daniel"));

        // Remover o elemento "Sandra" e imprimir o resultado diretamente
        System.out.println("Elemento 'Sandra' removido: " + lista.remove("Sandra"));
    }
}

