package br.com.NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------Naruto Uzumaki---------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Folha", 19, 200, NivelNinja.CHOUNNIN);
        System.out.println(naruto);


        System.out.println("--------Sasuke Uchiha---------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Folha", 19, 190, NivelNinja.CHOUNNIN);


    }
}
