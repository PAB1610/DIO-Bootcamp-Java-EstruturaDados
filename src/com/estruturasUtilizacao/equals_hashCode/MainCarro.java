package com.estruturasUtilizacao.equals_hashCode;

import java.util.ArrayList;
import java.util.List;

public class MainCarro {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("ford")));
        System.out.println((new Carro("ford").hashCode()));
        System.out.println((new Carro("ford1").hashCode()));

        Carro carro1 = new Carro("ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
