import java.util.Stack;
public class Pilha {
public static void main(String[] args){

        Stack<String> pilhaCarros = new Stack<>();

        pilhaCarros.push("uno");
        pilhaCarros.push("saveiro");
        pilhaCarros.push("ferrari");

        System.out.println("elemento no topo da pilha: " + pilhaCarros.peek());
        System.out.println("elemento removido da pilha: " + pilhaCarros.pop());
        System.out.println(pilhaCarros.empty()?"a pilha esta vazia":"a pilha esta com elementos");

    }
}
