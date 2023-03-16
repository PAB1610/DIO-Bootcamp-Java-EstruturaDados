package com.projeto.fila;

public class MainFila {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new NoFila("1º"));
        minhaFila.enqueue(new NoFila("2º"));
        minhaFila.enqueue(new NoFila("3º"));
        minhaFila.enqueue(new NoFila("4º"));
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new NoFila("1º"));
        System.out.println(minhaFila);



    }
}
