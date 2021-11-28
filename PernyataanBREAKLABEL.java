import java.util.Scanner;

public class PernyataanBREAKLABEL {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasAwal = inputObject.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = inputObject.nextInt();
        System.out.print("Masukkan batas STOP : ");
        int batasStop = inputObject.nextInt();

        selesai:
        for (int i = batasAwal; i < batasAkhir; i++) {
            if (i == batasStop)
                break selesai;
            System.out.println(i + " ");
        }
    }
}