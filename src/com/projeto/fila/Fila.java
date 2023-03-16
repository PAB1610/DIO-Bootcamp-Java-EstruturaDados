package com.projeto.fila;

public class Fila {
    private NoFila referenciaNoEntrada; //referencia de entrada na fila;

    //construtor
    public Fila() {
        this.referenciaNoEntrada = null;
    }

    /**Metodo que verifica se a fila esta vazia*/
    public boolean isEmpty(){
        if(this.referenciaNoEntrada == null)// se noEntrada for nulo a fila esta vazia
            return true;
        else
            return false;
    }

    /**Metodo enqueue (enfileirar)*/
    public  void enqueue(NoFila novoNo){
        novoNo.setReferenciaNoFrente(referenciaNoEntrada);
        this.referenciaNoEntrada = novoNo;
    }

    /**retorna o primeiro No da fila*/
    public NoFila firts(){
        if (this.isEmpty() == false){ //se a fila nao esta vazia
            NoFila primeiroNo = referenciaNoEntrada;
            while(true){//vou percorrer até o primeiro No
                if (primeiroNo.getReferenciaNoFrente() != null) //se não for nulo é porque existe outro NO
                    primeiroNo = primeiroNo.getReferenciaNoFrente();
                else{
                    break;
                }
            }
        }
        return  null;

    }//fim metodo first

    /**Metodo desenfileirar retira primeiro No da fila e retorna-o*/
    public NoFila dequeue(){
        if (this.isEmpty() == false){//se a fila nao esta vazia
            NoFila primeiroNo = referenciaNoEntrada;
            NoFila noAuxiliar = referenciaNoEntrada;
            while(true){
                if (primeiroNo.getReferenciaNoFrente() != null) { //se não for o primeiro recebe a referencia do proximo
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNoFrente();
                }
                else { //se for o primeiro recebera referencia null
                    noAuxiliar.setReferenciaNoFrente(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return  null;

    }//fim metodo dequeue

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = referenciaNoEntrada;

        if (this.referenciaNoEntrada != null){
            while (true){
                stringRetorno += "[No{Conteudo=" + noAuxiliar.getConteudo() + "}]->";
                if(noAuxiliar.getReferenciaNoFrente() != null){
                    noAuxiliar = noAuxiliar.getReferenciaNoFrente();
                }
                else{
                    stringRetorno = stringRetorno + "null";
                    break;
                }
            }

        }else {
            stringRetorno = "null";

        }
        return stringRetorno;
    }
}
