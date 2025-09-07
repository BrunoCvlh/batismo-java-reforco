package br.com.NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        NinjaRecords ninja1 = new NinjaRecords("Naruto", 24);
        ninja1.nome();
        ninja1.idade();
        System.out.println(ninja1.nome());
        System.out.println(ninja1.idade());

    }
}
