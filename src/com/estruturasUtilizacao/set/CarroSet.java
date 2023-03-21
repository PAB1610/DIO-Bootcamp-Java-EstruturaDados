package com.estruturasUtilizacao.set;

import java.util.Objects;

public class CarroSet implements  Comparable<CarroSet>{
    String marca;

    public CarroSet(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //se a referencia de memoria dos dois objetos são iguais
        if (o == null || getClass() != o.getClass()) return false; //se as classes são diferentes
        CarroSet carro = (CarroSet) o;
        return Objects.equals(marca, carro.marca);

    }

    //retorna um numero gerado a partir da marca
    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        String str= "";
        str+= this.marca + " ";
        return str;
    }


    //ordenar por tamanho da String
/*    @Override
    public int compareTo(CarroSet o) {
        if(this.marca.length() < o.marca.length()){
            return -1;
        }else if(this.marca.length() > o.marca.length()){
            return 1;
        }
        return 0;
    }*/

    //ordena a lista por ordem alfabética
    @Override
    public int compareTo(CarroSet o) {
        return this.getMarca().compareTo(o.getMarca());
    }

}
