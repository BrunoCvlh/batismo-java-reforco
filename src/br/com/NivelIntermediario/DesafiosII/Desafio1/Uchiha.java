package br.com.NivelIntermediario.DesafiosII.Desafio1;

public class Uchiha extends Ninja{
    public void MostrarHabilidadeEspecial(){
        System.out.println("Mangekyou Sharingan! (olhos sangrando)");
    };
    public void MostrarInfo(){
        System.out.printf("\nNome do ninja: %s\nIdade: %d\nMissão: %s\nDificuldade: %s\nStatus da missão: %s\n", nome,idade,missao,nivelDeDificuldade,statusMissao);
        MostrarHabilidadeEspecial();
    };

}
