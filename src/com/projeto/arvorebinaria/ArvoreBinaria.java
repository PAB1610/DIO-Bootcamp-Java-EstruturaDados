package com.projeto.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

                     /**METODOS INSERIR*/

    //este metodo ira chamar o outro metodo inserir que é privado que contem toda a
    //logica para inserção do novoNo na árvore
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    //metodo que insere um nó na árvore: ele é recursivo e vai ficar chamando ele mesmo
    // até chegar a posição onde se deve inserir o novo nó.
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){//se atual for nulo, significa que estamos na raiz da arvore
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){//comparar se conteudo do novo No é menor que o conteudo do NO atual
                atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
            return atual;
    }



                    /**METODO DE EXIBIÇÃO IN ORDEM*/
    public void exibirInOrdem(){
        System.out.println("\nExibindo inOrdem: ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }


                     /**METODO DE EXIBIÇÃO POS ORDEM*/
    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem: ");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

                     /**METODO DE EXIBIÇÃO PRE ORDEM*/
    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem: ");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    /**METODO REMOVE*/
    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temporario = null;

            //Percorrendo a arvore para saber se o conteudo passado existe
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){// se menor vai p/ direita
                        atual = atual.getNoEsq();
                }else{ //se for maior vai para a esquerda
                    atual = atual.getNoDir();
                }

            }
            if(atual == null){//se isso for verdade o conteudo da arvare a ser excluido nao foi encontrado
                System.out.println("Conteudo nao encontrado. Bloco Catch");
            }

            //condicoes para exclusão do NO da árvore
            if(pai == null){//se pai é nulo é porque estamos no NO raiz
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for(
                            temporario = atual, filho = atual.getNoEsq();
                            filho.getNoDir() != null;
                            temporario = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temporario.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }

                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

            }else if(atual.getNoDir() == null){ //se a referencia NO a direita é nulo
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }

            }else if(atual.getNoEsq() == null){//se a referencia NO a esquerda é nulo
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }

            }else{
                for(
                        temporario = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temporario = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temporario.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }//fim das condições
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }

    }//fim metodo remover



}//fim classe
