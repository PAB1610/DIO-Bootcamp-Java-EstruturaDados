package com.estruturasUtilizacao.map;

import java.util.*;

/**SET = conjunto*/
public class MainAluno {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        //criando um aluno
        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3A");
        System.out.println(aluno);

        //retorna o primeiro argumento
        System.out.println(aluno.keySet());

        //retorna o segundo argumento
        System.out.println(aluno.values());

        List<Map<String, String>> listAlunos = new ArrayList<>();
        listAlunos.add(aluno);
        Map<String, String> aluno2 = new HashMap<>();

        //criando um aluno
        aluno.put("Nome", "Maria");
        aluno.put("Idade", "18");
        aluno.put("Media", "9.5");
        aluno.put("Turma", "3B");

        listAlunos.add(aluno2);
        System.out.println(listAlunos);

        //CONTRAINKEY retorna se existe a chave informada
        System.out.println(aluno.containsKey("Nome"));


    }

}



