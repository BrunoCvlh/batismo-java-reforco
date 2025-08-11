package br.com.NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        //Objeto 1
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Folha";
        Sasuke.idade = 16;
        Sasuke.SharinganAtivado();

        //Objeto 2
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado();

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Folha";
        Sakura.idade = 15;
        Sakura.AtivarCura();

        //Objeto 4
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Folha";
        Hinata.idade = 16;
        Hinata.ByakuganAtivo();

        //Objeto 5
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade = 9;
        boruto.aldeia = "Folha";
        boruto.AtivarOKarma();
        boruto.AtivarJougan();
        boruto.ModoSabioAtivado();

    }
}
