package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio2;

public class NinjaBasico implements Ninja{

    String nome;
    String aldeia;
    int idade;

    @Override
    public void MostrarInformacoes() {
        System.out.printf("Nome: %s \nIdade: %d \nAldeia: %s\n", nome, idade, aldeia);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Jogar Shuriken!!\n");
    }
}
