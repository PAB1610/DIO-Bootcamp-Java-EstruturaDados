package com.estruturasUtilizacao.equals_hashCode;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca) {
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
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);

    }

    //retorna um numero gerado a partir da marca
    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
