package br.com.NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void JogarShuriken(){
        System.out.printf("\nO ninja %s utilizou Rasengan com Shuriken!",nome);
    };

}
