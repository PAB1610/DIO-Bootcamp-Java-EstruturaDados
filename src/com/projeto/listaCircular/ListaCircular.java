package com.projeto.listaCircular;

public class ListaCircular<T> {

    private NoCircular<T> cabeca;
    private NoCircular<T> cauda;

    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    //adiciona No no inicio da lista
    public void add(T conteudo){
        NoCircular<T> novoNo = new NoCircular<>(conteudo);

        if(this.tamanhoLista == 0) {//testo lista esta vazia
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }                                                       //fim metodo Add


    public void remove(int index){
        if(index >= this.tamanhoLista){//se o indice é maior ou igual ao tamanho da lista
            throw new IndexOutOfBoundsException("Indice maior que tamanho da lista");
        }
        NoCircular<T> noAuxiliar = this.cauda;
        if(index == 0){
           this.cauda = this.cauda.getNoProximo();
           this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for (int i = 0; i < index - 1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
         this.tamanhoLista--;
    }                                                               //fim metodo remove


    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoCircular<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        if(index == 0){
            return this.cauda;
        }
        NoCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; ((i < index) && (noAuxiliar !=null) ); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false; //lista vazia, retorna true
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strRetorno+= "[No{Dado: " + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
        return strRetorno;
    }

}
