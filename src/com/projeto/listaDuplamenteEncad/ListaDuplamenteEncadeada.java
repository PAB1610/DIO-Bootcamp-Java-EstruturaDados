package com.projeto.listaDuplamenteEncad;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private  NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    //metodo size (tamanho lista)


    //construtor
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    //metodo recebe um conteudo e add elemento no final da lista
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null); //proximo No vai apontar para NULO
        novoNo.setNoPrevio(ultimoNo); //aponta para o antigo ultimo NO
        if(primeiroNo == null){ //se nao havia nenhum NO na lista o primeiro NO é nulo
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){ //se a lista esta vazia o ultimo NO aponta para nulo
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++; //aqui eu incremento o tamanho da lista sempre apos adicionar
                        // um elemento à lista sem precisar percorrê-la.

    }


    //metod que recebe um conteudo e add elemento em um indice da lista
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){//testar se estou no meio da lista
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){ // testa se é o primeiro indice da lista
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }                                                           //fim metodos adds

    //metodo que remove um dado da lista
    public void remove(int index){
        if(index == 0){ //estou no primeiro no da lista?
            primeiroNo = primeiroNo.getNoProximo(); //referencia entrada apontando outro NO
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }                                                               //fim metodo remove


    //metodo que retorna o conteudo do NO referente ao indice passado
    //este metodo trabalha em conjunto com o metodo getNO
    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //metodo que percorre a lista até o indice passado para pegar o NO correspondente
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }                                                   //fim metodos GET e getNO


    //retorna tamanho lista
    public int size(){
        return tamanhoLista;
    }

    //implementação metodo toString (impressao resultados lista)
    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo; //entrada lista pelo primeiro No
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{Dado: " + noAuxiliar.getConteudo() + "]}-->";
           noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return  strRetorno;
    }
}
