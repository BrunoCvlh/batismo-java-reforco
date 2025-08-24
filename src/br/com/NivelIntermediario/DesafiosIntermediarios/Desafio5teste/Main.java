package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5teste;

public class Main {
    public static void main(String[] args) {
        ContaCorrente naruto = new ContaCorrente("Naruto", 2000.0);
        naruto.consultarSaldo();
        naruto.depositar(110.05);
        naruto.consultarSaldo();

        ContaPoupanca sasuke = new ContaPoupanca("Sasuke", 15000.97);
        sasuke.consultarSaldo();
        sasuke.depositar(500.01);
        sasuke.consultarSaldo();
    }
}
