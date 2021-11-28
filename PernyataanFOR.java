import java.util.Scanner;

public class PernyataanFOR {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasAwal = inputObject.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = inputObject.nextInt();

        for (int i = batasAwal; i < batasAkhir; i++) {
            System.out.println(i + " ");
        }
    }
}