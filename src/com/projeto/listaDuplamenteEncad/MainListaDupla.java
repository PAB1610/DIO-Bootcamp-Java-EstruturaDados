package com.projeto.listaDuplamenteEncad;

public class MainListaDupla {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");

        System.out.println(minhaLista);

        minhaLista.remove(3); //removi c4
        minhaLista.add(3, "99"); //adicione na mesma posicao 99

        System.out.println(minhaLista);
        System.out.println("Conteudo: " + minhaLista.get(3));

    }
}
