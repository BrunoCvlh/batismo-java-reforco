package br.com.NivelIntermediario.Enums;

public class Missoes {
    private String descricao;
    private RankDasMissoes rank;

    public void mostrarMissao(){
        System.out.printf("Está é uma missão para " + getDescricao() + " de rank " + getRank() + " e pontuação " + rank.getPontuacaoDaMissao());
    };

    public Missoes(String descricao, RankDasMissoes rank) {
        this.descricao = descricao;
        this.rank = rank;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public RankDasMissoes getRank() {
        return rank;
    }

    public void setRank(RankDasMissoes rank) {
        this.rank = rank;
    }
}
