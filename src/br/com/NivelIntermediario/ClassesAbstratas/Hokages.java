package br.com.NivelIntermediario.ClassesAbstratas;

import com.sun.security.jgss.GSSUtil;

public abstract class Hokages {
    String nome;
    int idade;

    public abstract void PoderEspecial();

    public void DeclararStatus(){
        System.out.println("Eu sou um Hokage!!");
    };

}
