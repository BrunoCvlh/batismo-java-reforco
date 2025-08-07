package br.com.NivelIntermediario.DesafiosII.Desafio1;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    public void MostrarInfo(){
        System.out.printf("\nNome do ninja: %s\nIdade: %d\nMissão: %s\nDificuldade: %s\nStatus da missão: %s", nome,idade,missao,nivelDeDificuldade,statusMissao);
    };
}
