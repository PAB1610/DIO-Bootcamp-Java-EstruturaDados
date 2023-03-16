package com.projeto.listaEncadeada;

public class ListaEncadeada<T> {

    private NoListaE<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    //metodo que verifica se a lista esta vazia (is Empty = está vazia)
    public boolean isEmpty(){
        if(referenciaEntrada == null){
            return true;
        }else{
            return false;
        }
    } //fim metodo isEmpty

    //metodo que retorna o tamanho da lista (Size = tamanho)
    public int size(){
        int tamanhoLista = 0;
        NoListaE<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }//fim metodo size

    //metodo que adiciona um conteudo a lista
    public void add(T conteudo){
        NoListaE<T> novoNo = new NoListaE<>(conteudo);
        if(this.isEmpty() == true){//se a lista esta vazia
            this.referenciaEntrada = novoNo;
            return;
        }
        NoListaE<T> noAuxiliar = this.referenciaEntrada;
        for (int i = 0; i< this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }//fim metodo add


    //metodo que verifica qual o proxino no da Lista
    private NoListaE<T> getNo(int index){
        validaIndice(index);
        NoListaE<T> noAuxiliar = referenciaEntrada;
        NoListaE<T> noRetorno = null;
        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }//fim metodo getNo


    //Metodo que valida qual o tamanho máximo do indice
    private void validaIndice(int index){
        int ultimoIndice = size()-1;
        if(index >= size()){
            throw new IndexOutOfBoundsException("Nao ha conteudo no indice " + index +
                    "desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }//fim metodo validaIndice

    //metodo que retorna informacao do NÓ
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //metodo remove nó da lista e retorna o conteudo do NÓ removido
    public T remove(int index){
        NoListaE<T> noPivor = this.getNo(index); //trocar noPivor por noRemover
        if(index == 0){ //estou removendo o primeiro nó (0)
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        NoListaE<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return  noPivor.getConteudo();
    }//fim metodo remove

    //metodo apresentacao informacao


    @Override
    public String toString() {
        String strRetorno = "";
        NoListaE<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "[NO{info: " + noAuxiliar.getConteudo() + "}]--> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }//fim toString

}//fim classe
