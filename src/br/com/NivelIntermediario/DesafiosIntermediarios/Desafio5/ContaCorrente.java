package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nomeNinjaConta, double saldo) {
        super(nomeNinjaConta, saldo);
    }

    @Override
    public void consultarSaldo(){
        saldo += valorDeDepositoOuSaque;
        System.out.printf("O saldo do %s em CONTA CORRENTE é: %.2f", nomeNinjaConta, saldo);
    };

    @Override
    public void depositarDouble(double valorDeDepositoOuSaque){
        saldo += valorDeDepositoOuSaque;
        System.out.printf("O ninja %s depositou %.2f em CONTA CORRENTE.\n", nomeNinjaConta, valorDeDepositoOuSaque);
    };
}
