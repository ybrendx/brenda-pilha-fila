import java.util.Stack;

public class Fila {

    public static void main(String[]args){

        Stack<String> carro = new Stack<>();

        carro.push("Toro");
        carro.push("Corola");
        carro.push("Hillux");
        carro.push("Saveiro");
        carro.push("BMW");

        //System.out.println("Topo da pilha: " + carro.pop());
        //O metodo pop ele retorna o elemento do topo da pilha retirando o mesmo da posição
        //System.out.println("O topo da Pilha é: " + carro.peek());
        //O metodo peek me retorna o elemento do topo da pilha sem retirar o elemento
        System.out.println("Imprimindo a Pilha: " + carro);
        for (String c:carro){
            System.out.println(c);
        }
        System.out.println(carro.empty()?"Pilha vazia" : "Pilha com elementos");
        //O empty vai verificar se a pilha estra vazia
    }
}