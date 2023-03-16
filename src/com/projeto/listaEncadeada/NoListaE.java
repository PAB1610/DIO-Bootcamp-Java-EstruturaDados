package com.projeto.listaEncadeada;

import com.projeto.no.No;

/**Classe Nó já será implementada utilizando o conceito de Generics*/
public class NoListaE<T> {
    private T conteudo;
    private NoListaE proximoNo;

    //construtores
    public NoListaE() {
        this.proximoNo = null;
    }

    public NoListaE(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public NoListaE(T conteudo, NoListaE proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }//fim construtores

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaE getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaE proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListaE{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado() {
        String str = "NoListaE{" + "conteudo=" + conteudo + '}';
        if (proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}
