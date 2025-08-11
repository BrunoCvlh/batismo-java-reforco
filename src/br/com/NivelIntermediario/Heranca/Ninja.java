package br.com.NivelIntermediario.Heranca;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public String ChamadaNinja(){
        return "Eu sou um ninja";
    }

    public int idadeParaConsiderarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    };
}

