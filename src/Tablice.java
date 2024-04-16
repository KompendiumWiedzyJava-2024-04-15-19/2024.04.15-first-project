public class Tablice {
    public static void main(String[] args) {
        String s = "Cos";
        String[] tablica = new String[10];
        tablica[0] = "Janusz";
        tablica[1] = "Zbyszek";
        tablica[9] = "Karol";

        System.out.println(tablica[9]);

        int[][] tablica2D = new int[5][5];
        tablica2D[2][3] = 7;

        int[][][] tablica3D = new int[3][3][3];

        int[] tab = {2,3,45,7,876,4,43};
        int[][] tab2 = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
    }
}
