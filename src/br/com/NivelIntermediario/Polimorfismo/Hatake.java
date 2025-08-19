package br.com.NivelIntermediario.Polimorfismo;

public class Hatake extends Ninja implements AnbuInterface, SharinganInterface{

    public void boasVindas(){
        System.out.println("Eu sou Hatake!");
    };

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void familiaAnbu(){
        System.out.println("Faço parte da Anbu");
    };

    public void SharinganAtivado(){
        System.out.println("Tenho o sharingan e ativei!");
    };
}
