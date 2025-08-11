package br.com.NivelIntermediario.ClassesAbstratas;

public class Senju extends Hokages{

    public void PoderEspecial(){ //se o método abstrato da classe mãe não for declarado, dá erro de compilação
        System.out.println("Domino jutsus de madeira");
    };
}
