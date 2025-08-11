package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio2;

public class Main {
    public static void main(String[] args) {
        NinjaBasico narutinho = new NinjaBasico();
        narutinho.nome = "Naruto Uzumaki";
        narutinho.idade = 15;
        narutinho.aldeia = "Folha";
        narutinho.MostrarInformacoes();
        narutinho.executarHabilidade();

        System.out.println("\n");

        NinjaAvancado orochimaru = new NinjaAvancado();
        orochimaru.nome = "Orochimaru";
        orochimaru.idade = 30;
        orochimaru.aldeia = "Som";
        orochimaru.MostrarInformacoes();
        orochimaru.executarHabilidade();
        orochimaru.EspecialidadeNinja();

    }
}
