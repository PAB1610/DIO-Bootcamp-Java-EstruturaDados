package com.projeto.listaEncadeada;

public class MainListaE {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("num 1");
        minhaListaEncadeada.add("num 2");
        minhaListaEncadeada.add("num 3");
        minhaListaEncadeada.add("num 4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(2));


        System.out.println(minhaListaEncadeada);

    }
}
