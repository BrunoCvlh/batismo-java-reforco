package br.com.NivelIntermediario.Generics;

public class Shuriken {

    private String nome;

    public Shuriken(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Objeto: "+ nome;
    }
}
