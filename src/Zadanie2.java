import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();
        for (int i = 0; i <100; i++) {
            tab[i] = random.nextInt(0,1001);
            System.out.println(tab[i]);
        }

        int max = tab[0];
        for(int element : tab) {
            if(element > max) {
                max = element;
            }
        }

        System.out.println("Najwieksza liczba: " + max);
        /*System.out.print("cos");
        System.out.print(" ");
        System.out.print("innego");
        System.out.print(".");
        System.out.println();*/
    }
}
