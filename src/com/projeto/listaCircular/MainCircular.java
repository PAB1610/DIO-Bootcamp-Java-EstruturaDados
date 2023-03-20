package com.projeto.listaCircular;

public class MainCircular {
    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("c0");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        System.out.println(minhaLista);
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(3)); //volta para o indice anterior

        System.out.println("-----------------------");//fica entrando pela cabeca e sai pela cauda e fica repetindo
        for(int i = 0; i < 20; i++){
            System.out.println(minhaLista.get(i));
        }
    }
}
