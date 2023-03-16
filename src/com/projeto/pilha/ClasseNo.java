package com.projeto.pilha;




/**Implementação classe NO sem utilizar GENERICS */
public class ClasseNo {

    private int dado; //no de inteiros
    private ClasseNo referenciaNoAbaixo = null; //referencia para o NO abaixo


    /**Contrutor vazio*/
    public ClasseNo() {
    }

    /**Contrutor passa apenas o dado*/
    public ClasseNo(int dado) {
     this.dado = dado;
    }

    /**metodos GETERS e SETERS*/
    public int getDado() {
     return dado;
    }

    public void setDado(int dado) {
     this.dado = dado;
    }

    public ClasseNo getReferenciaNoAbaixo() {
     return referenciaNoAbaixo;
    }

    public void setReferenciaNoAbaixo(ClasseNo novoNo) {
     this.referenciaNoAbaixo = novoNo;
    }

    /**Metodo TO STRING, mostrando apenas o NO*/
    @Override
    public String toString() {
     return "ClasseNo{" +
             "dado=" + dado +
             '}';
    }
}
