package com.estruturasUtilizacao.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<CarroQueue> queueCarros = new LinkedList<>();

        queueCarros.add(new CarroQueue("Ford"));
        queueCarros.add(new CarroQueue("Chevrolet"));
        queueCarros.add(new CarroQueue("Fiat"));


//retorna true se conseguiu adicionar objeto a lista, se não coseguir dará um erro
        System.out.println(queueCarros.add(new CarroQueue("Peugeot")));
        System.out.println(queueCarros);

        //OFFER retorna falso se não conseguir adicionar item na lista
        System.out.println(queueCarros.offer(new CarroQueue("Renault")));
        System.out.println(queueCarros);

        //PEEK exibe primeiro elemento que entrou na fila mas não o remove
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //PEEK exibe primeiro elemento da fila e o remove da fila
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        //size() retorna o tamanho da fila
        //isEmpty() retorna true se a fila está vazia e false se não estiver

    }
}
