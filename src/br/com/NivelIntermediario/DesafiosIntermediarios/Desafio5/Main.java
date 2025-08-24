package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente naruto = new ContaCorrente("Naruto", 20000.04);


        ContaPoupanca sasuke = new ContaPoupanca("Sasuke", 10000);
        sasuke.consultarSaldo();
        sasuke.depositarDouble(100.0);
        sasuke.consultarSaldo();

    }
}
