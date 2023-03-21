package com.estruturasUtilizacao.set;

import java.util.*;

/**SET = conjunto*/
public class MainCarroSet {
    public static void main(String[] args) {

        Set<CarroSet> hashSetCarros = new HashSet<>();

        //SET não tem ordem de inserção
        hashSetCarros.add(new CarroSet("ford"));
        hashSetCarros.add(new CarroSet("chevrolet"));
        hashSetCarros.add(new CarroSet("fiat"));
        hashSetCarros.add(new CarroSet("peugeot"));
        hashSetCarros.add(new CarroSet("zip"));
        hashSetCarros.add(new CarroSet("alfa romeo"));
        System.out.println(hashSetCarros);


        //utilização de árvores
        Set<CarroSet> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new CarroSet("ford"));
        treeSetCarros.add(new CarroSet("chevrolet"));
        treeSetCarros.add(new CarroSet("fiat"));
        treeSetCarros.add(new CarroSet("peugeot"));
        treeSetCarros.add(new CarroSet("zip"));
        treeSetCarros.add(new CarroSet("alfa romeo"));

        System.out.println(treeSetCarros);



    }
}
