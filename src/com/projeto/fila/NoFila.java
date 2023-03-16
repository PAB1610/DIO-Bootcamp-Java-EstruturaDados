package com.projeto.fila;

public class NoFila {
    private Object object; //objeto que engloba todos os objetos do java, todos são herdados deste
    private NoFila referenciaNoFrente;

    /*contrutor*/
    public NoFila(Object object) {
        referenciaNoFrente = null;
        this.object = object;
    }

    //construtor vazio

    public NoFila() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
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
                "object=" + object +
                '}';
    }
}
