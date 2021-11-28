public class GanjilGenap {
    public static void main(String args[]) {
        int i = 1, j = 1;
        System.out.println("Deret Bilangan Ganjil dan Genap\n\nBilangan Ganjil : ");
        while (i <= 20) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nBilangan Genap : ");
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
    }
}