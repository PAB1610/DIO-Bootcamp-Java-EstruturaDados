package com.projeto.arvorebinaria.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    //declaracao de metodos abstratos
    public abstract boolean equals(Object o);
    public abstract int hasCode();
    public abstract int compareTo(T outro);
    public abstract String toString();


}
