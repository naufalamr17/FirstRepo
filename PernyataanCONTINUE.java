import java.util.Scanner;

public class PernyataanCONTINUE {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasAwal = inputObject.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = inputObject.nextInt();
        System.out.print("Masukkan angka yang dilewati : ");
        int skip = inputObject.nextInt();

        for (int i = batasAwal; i < batasAkhir; i++) {
            if (i == skip)
                continue;
            System.out.println(i + " ");
        }
    }
}