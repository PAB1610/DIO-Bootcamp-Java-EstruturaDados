package com.projeto.noQualquerTipo;

/**Exemplo da execucação de um Encadeamento de NO na classe MAIN
 public class MainNo {
 public static void main(String[] args) {

 No no1 = new No("Conteudo no1: ");

 No no2 = new No("Conteudo no2: ");
 no1.setProximoNo(no2);

 No no3 = new No("Conteudo no3: ");
 no2.setProximoNo(no3);

 No no4 = new No("Conteudo no4: ");
 no3.setProximoNo(no4);

 /*UTILIZANDO O CONCEITO DE REFERENCIA DE MEMORIA
 Nesque exemplo tempo o no1 apontando para o no2, no2 apontando para o no3,
 * no3 apontando para o no4 e o no4 apontando Null.


 //LEMBRANDO que há um objeto chamado no criado.
 System.out.println(no1);
 System.out.println(no1.getProximoNo());
 System.out.println(no1.getProximoNo().getProximoNo());
 System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
 System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

 }
 }*/



/**Auteração da estrutura No para aceitar qualquer estrutura de dados*/
public class MainNoQualquerEstrutura {
    public static void main(String[] args) {

        /*Com a utilização de NO de qualquer tipo, eu declaro o tipo de NO
         * na criação do objeto dentro da classe MAIN. Neste caso criamos um
         * nó de String na hora da declaração do objeto na classe MAIN*/
        NoQualquerEstrutura<String> no1 = new NoQualquerEstrutura<> ("Conteudo Qualquer no1: ");

        NoQualquerEstrutura<String> no2 = new NoQualquerEstrutura<> ("Conteudo Qualquer no2: ");
        no1.setProximoNo(no2);

        NoQualquerEstrutura<String> no3 = new  NoQualquerEstrutura<> ("Conteudo Qualquer no3: ");
        no2.setProximoNo(no3);

        NoQualquerEstrutura<String> no4 = new  NoQualquerEstrutura<> ("Conteudo Qualquer no4: ");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
