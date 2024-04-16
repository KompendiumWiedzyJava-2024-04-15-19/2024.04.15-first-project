public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < 100; i++) {
            tab[i] = i;
        }

        for(int element : tab) {
            if(element % 2 == 0) {
                System.out.println(element);
            }
        }
        /*for(int element : tab) {
            System.out.println(element);
        }*/
    }
}
