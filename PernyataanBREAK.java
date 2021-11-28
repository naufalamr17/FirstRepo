import java.util.Scanner;

public class PernyataanBREAK {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasAwal = inputObject.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = inputObject.nextInt();
        System.out.print("Masukkan batas STOP : ");
        int batasStop = inputObject.nextInt();

        for (int i = batasAwal; i < batasAkhir; i++) {
            if (i == batasStop)
                break;
            System.out.println(i + " ");
        }
    }
}