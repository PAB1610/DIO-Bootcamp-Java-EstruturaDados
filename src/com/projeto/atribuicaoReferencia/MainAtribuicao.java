package com.projeto.atribuicaoReferencia;

public class MainAtribuicao {
    public static void main(String[] args) {

        /** Exemplo de atribuição, cópia de valores em variáveis do tipo primitivo.
        Ao copiar um valor de uma variavel em outra, o Java atribui o valor
        contido na variável. Se uma for alterada, nada acontecerá com a outra a não ser
         que eu a altere também.*/

        int numeroA=1;
        int numeroB=numeroA;

        System.out.println("A:" + numeroA + " B=" + numeroB);
        numeroA = 2;
        System.out.println("Novo A:" + numeroA + " B=" + numeroB);

       /** Exemplo de copia de objetos. Ao copiar-se um objeto, como no exemplo abaixo,
        * o JAVA não copia os valores mas sim a REFERENCIA de memoria.
        * Se um objeto for modificado, o outro também será.*/

        MeuObjeto objetoA = new MeuObjeto(1);
        MeuObjeto objetoB = objetoA;

        System.out.println("Objeto A:" + objetoA + " Objeto B=" + objetoB);

        objetoB.setNumero(2);
        System.out.println("Novo Objeto A:" + objetoA + " Novo Objeto B=" + objetoB);
    }
}
