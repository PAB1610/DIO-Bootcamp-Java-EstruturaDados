package com.projeto.pilha;

public class MainPilha {
    public static void main(String[] args) {

    //adicionando elementos na pilha
        ClassePilha minhaPilha = new ClassePilha();
        minhaPilha.push(new ClasseNo(1));
        minhaPilha.push(new ClasseNo(2));
        minhaPilha.push(new ClasseNo(3));
        minhaPilha.push(new ClasseNo(4));
        minhaPilha.push(new ClasseNo(5));
        minhaPilha.push(new ClasseNo(6));

        System.out.println(minhaPilha);

    //removendo elemento do Topo da pilha
        minhaPilha.pop();
        minhaPilha.pop();
        minhaPilha.pop();
    // adicionando novo elemento
        minhaPilha.push(new ClasseNo(6));
        System.out.println(minhaPilha);


        System.out.println("Topo lista: " + minhaPilha.top());
    }
}
