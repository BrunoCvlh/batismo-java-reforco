package br.com.NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 17, 95, NivelNinja.JOUNNIN);
        naruto.JogarShuriken();
        naruto.EstrategiaDeCombate();
        naruto.UsarHabilidadeNinja();
        naruto.EstrategiaDeCombate(160);

        Uchiha sasuke = new Uchiha("Sasuke", "Folha", 18, 100, NivelNinja.JOUNNIN);
        sasuke.EstrategiaDeCombate();
        sasuke.SharinganAtivado();

        Hatake kakashi = new Hatake("Kakashi", "Folha", 35, 560, NivelNinja.JOUNNIN);
        kakashi.UsarHabilidadeNinja();
        kakashi.familiaAnbu();

        Uchiha madara = new Uchiha("Madara", "Folha", 35, 900, NivelNinja.KAGE);
        madara.SharinganAtivado();
        madara.EstrategiaDeCombate();
        madara.EstrategiaDeCombate();
        madara.EstrategiaDeCombate(150);




    }
}
