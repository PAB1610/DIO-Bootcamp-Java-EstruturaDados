package com.estruturasUtilizacao.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainCarroArrayL {
    public static void main(String[] args) {

        List<CarroArrayL> listCarros = new ArrayList<>();

        listCarros.add(new CarroArrayL("ford"));
        listCarros.add(new CarroArrayL("chevrolet"));
        listCarros.add(new CarroArrayL("fiat"));
        listCarros.add(new CarroArrayL("ferrari"));

        //CANTAINS retorna true se houver o elemento na lista
        System.out.println(listCarros.contains(new CarroArrayL("ford")));

        //GET retorna o dado no indice informado
        System.out.println(listCarros.get(2));

        //INDEXOF retorna em qual posicao da lista esta o dado informado
        // se não estiver na lista ele retorna -1
        System.out.println(listCarros.indexOf(new CarroArrayL("ferrari")));

        //REMOVE remove o item do indice passado
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}
