package br.com.NivelBasico.Array;

public class Array2D {
    public static void main(String[] args) {
        String[][] ninjaEAldeia = new String[3][3];

        ninjaEAldeia[0][0] = "Konoha";
        ninjaEAldeia[0][1] = "Naruto";
        ninjaEAldeia[0][2] = "Sasuke";

        ninjaEAldeia[1][0] = "Nevoa";
        ninjaEAldeia[1][1] = "Zabuza";
        ninjaEAldeia[1][2] = "Haku";

        ninjaEAldeia[2][0] = "Deserto";
        ninjaEAldeia[2][1] = "Gaara";
        ninjaEAldeia[2][2] = "Temari";

        for (int i = 0; i < ninjaEAldeia.length; i++) {
            System.out.println("Aldeia: " + ninjaEAldeia[i][0] + ". Ninjas: " + ninjaEAldeia[i][1] +" e "+ ninjaEAldeia[i][2]);
        }
    }
}
