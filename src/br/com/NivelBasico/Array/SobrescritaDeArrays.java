package br.com.NivelBasico.Array;

public class SobrescritaDeArrays {
    public static void main(String[] args) {
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Kakashi";
        ninjas[3] = "Itachi";

        //Garbage Collector
        ninjas = new String[5];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sarutobi";
        ninjas[2] = "Kakuzo";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        System.out.println(ninjas[5]);
    }
}
