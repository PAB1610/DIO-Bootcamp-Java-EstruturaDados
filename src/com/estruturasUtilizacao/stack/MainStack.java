package com.estruturasUtilizacao.stack;

import java.util.Stack;
/**Stack = pilha*/
public class MainStack {
    public static void main(String[] args) {

        Stack<com.estruturasUtilizacao.stack.CarroStack> stackCarros = new Stack<>();

        stackCarros.push(new com.estruturasUtilizacao.stack.CarroStack("Ford"));
        stackCarros.push(new com.estruturasUtilizacao.stack.CarroStack("Chevrolet"));
        stackCarros.push(new com.estruturasUtilizacao.stack.CarroStack("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); //POP: remove o ultimo elemento da pilha
        System.out.println("--------------");
        System.out.println(stackCarros.peek()); //PEEK: mostra o ultimo elemento da pilha
        System.out.println(stackCarros);
        System.out.println("Vazia: " + stackCarros.isEmpty()); //ISEMPTY: testa se a pilha esta vazia

    }

}
