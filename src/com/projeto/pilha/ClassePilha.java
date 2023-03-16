package com.projeto.pilha;


public class ClassePilha {
    private ClasseNo referenciaNoTopoPilha;

    //construtor
    public ClassePilha() {
        this.referenciaNoTopoPilha = null;
    }

    /**
     * metodo empilhar (push):
     * 1º Criar um No auxiliar para receber a referencia do no atual
     * 2ºGuardar a referencia de No atual de topo da fila no noAuxiliar
     * 3º atribuir a referencia de memoria do novo NO a referenciaNo;
     * 4º dizer para o novo No empilhado que a referencia de topo anterior que estava
     * guardada agora é a referencia para o nó anterior
     */
    public void push(ClasseNo novoNo) {
        ClasseNo noAuxiliar = referenciaNoTopoPilha;
        referenciaNoTopoPilha = novoNo;
        referenciaNoTopoPilha.setReferenciaNoAbaixo(noAuxiliar);
    }

    /**
     * Método Pop: que retira o elemento do topo da pilha
     * 1º testar se a pilha não está vazia. (usando metodo isEmpty)
     * 2º Criar uma variavel auxiliar e atribuir a referencia do No do Topo da pilha
     * 3º
     */

    public ClasseNo pop() {
        if (this.isEmpty() == false) { // ou se minha pilha não estiver vazia
            ClasseNo noRetirado = referenciaNoTopoPilha;
            referenciaNoTopoPilha = referenciaNoTopoPilha.getReferenciaNoAbaixo();
            return noRetirado;
        } else
            return null;
    }

    //Metodo Top (TOPO): retorna a referencia do topo da lista
    public ClasseNo top() {
        return referenciaNoTopoPilha;
    }

    //metodo Is Empty (está vazia): retorna se a pilha esta vazia ou cheia.
    public boolean isEmpty() {
        if (referenciaNoTopoPilha == null)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno = stringRetorno + " Pilha\n";
        stringRetorno = stringRetorno + "----------------\n";

        ClasseNo noAuxiliar = referenciaNoTopoPilha;
        while (true){
            if(noAuxiliar != null) {
                stringRetorno = stringRetorno + "[No{dado: " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNoAbaixo();
            }
            else{
                break;}

        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }

}
