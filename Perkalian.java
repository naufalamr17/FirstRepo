import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);

        System.out.print("Masukkan Jumlah n : ");
        int n = inputObject.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 1; j <= n; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println("\n");
        }
    }
}