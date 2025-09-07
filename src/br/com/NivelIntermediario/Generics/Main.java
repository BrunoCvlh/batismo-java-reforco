package br.com.NivelIntermediario.Generics;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        BolsaDeItens<Object> pacote = new BolsaDeItens<>();

        pacote.guardarItemNaBolsa(new Kunai("Kunai de fogo"));
        pacote.guardarItemNaBolsa(new Shuriken("Shuriken Gigante"));

        pacote.mostrarFerramentas();
    }
}
