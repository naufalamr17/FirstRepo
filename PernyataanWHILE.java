import java.util.Scanner;

public class PernyataanWHILE {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasAwal = inputObject.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = inputObject.nextInt();

        while (batasAwal < batasAkhir) {
            System.out.println(batasAwal + " ");
            batasAwal++;
        }
    }
}