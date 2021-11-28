import java.util.Scanner;

public class PernyataanDOWHILE {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasAwal = inputObject.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = inputObject.nextInt();

        do {
            System.out.println(batasAwal + " ");
            batasAwal++;
        } while (batasAwal < batasAkhir);
    }
}