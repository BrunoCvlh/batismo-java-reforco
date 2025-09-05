package br.com.NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaDeItens<T> {

    private List<T> ferramentas;

    public BolsaDeItens() {
        this.ferramentas = new ArrayList<>();
    }

    public void guardarItemNaBolsa(T ferramenta){
        ferramentas.add(ferramenta);
    };

    public void mostrarFerramentas(){
        for(T ferramenta: ferramentas){
            System.out.println(ferramenta);
        };
    };
}
