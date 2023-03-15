package com.projeto.no;
/**Exemplo da criação de um Objeto com uma estrutura de No*/
public class No {
    private String conteudo;
    private No proximoNo;
   //construtor
    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
        /*Atribuimos NULL a variavel proximoNo para garantir que apos criar o No
        * sempre o ultimo No estará apontando para NULL*/
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public No getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    // exibir apenas o conteúdo
    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
