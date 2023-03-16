package com.projeto.fila;

public class NoFila<T> {//refatoracao classe NO utilizando generics
    private T conteudo; //objeto que engloba todos os objetos do java, todos são herdados deste
    private NoFila<T> referenciaNoFrente = null;

    /*contrutor*/

    public NoFila(T conteudo) {
        this.conteudo = conteudo;
    }

    //construtor vazio

    public NoFila() {
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(T objeto) {
        this.conteudo = objeto;
    }

    public NoFila getReferenciaNoFrente() {
        return referenciaNoFrente;
    }

    public void setReferenciaNoFrente(NoFila referenciaNoFrente) {
        this.referenciaNoFrente = referenciaNoFrente;
    }

    @Override
    public String toString() {
        return "NoFila{" +
                "Conteudo=" + conteudo +
                '}';
    }
}
