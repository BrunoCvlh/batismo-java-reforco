package br.com.NivelBasico.Array;

public class Array {
    public static void main(String[] args) {
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Kakashi";
        ninjas[3] = "Itachi";


        int[] idadesNinjas = new int[4];
        idadesNinjas[0] = 15;
        idadesNinjas[1] = 15;
        idadesNinjas[2] = 35;
        idadesNinjas[3] = 25;


        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("A idade do " + ninjas[i] + " é " + idadesNinjas[i] + " anos.");;
        }
    }
}
