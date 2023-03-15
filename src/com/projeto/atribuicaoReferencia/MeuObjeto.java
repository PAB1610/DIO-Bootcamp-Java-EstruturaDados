package com.projeto.atribuicaoReferencia;

public class MeuObjeto {
    Integer numero;

    public MeuObjeto(Integer numero) {
        this.numero = numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }
}
