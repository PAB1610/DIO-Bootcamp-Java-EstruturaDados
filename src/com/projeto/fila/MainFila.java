package com.projeto.fila;

public class MainFila {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("1º");
        minhaFila.enqueue("2º");
        minhaFila.enqueue("3º");
        minhaFila.enqueue("4º");
       // minhaFila.enqueue(1); nao aceita outra coisa que não seja strings
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila + "\n");

        minhaFila.enqueue("1º");
        System.out.println(minhaFila);
    }
}
