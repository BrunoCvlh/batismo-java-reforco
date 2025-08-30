package br.com.NivelIntermediario.Enums;

public enum RankDasMissoes {
    A(102),
    B(59),
    C(22);

    private int pontuacaoDaMissao;

    RankDasMissoes(int pontuacaoDaMissao) {
        this.pontuacaoDaMissao = pontuacaoDaMissao;
    }

    public int getPontuacaoDaMissao() {
        return pontuacaoDaMissao;
    }

    public void setPontuacaoDaMissao(int pontuacaoDaMissao) {
        this.pontuacaoDaMissao = pontuacaoDaMissao;
    }
}
