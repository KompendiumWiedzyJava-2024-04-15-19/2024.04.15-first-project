public class For {
    public static void main(String[] args) {
        int[] tab = {2,4,6,8,10};
        /*for(int i = 0; i < 5; i++) {
            System.out.println(tab[i]);
        }*/

        for(int element : tab) {
            System.out.println("Element: " + element);
        }


        /*String s1 = "Mateusz";
        String s2 = "Bereda";

        String s3 = s1 + " " + s2;
        System.out.println(s3);*/

    }
}
