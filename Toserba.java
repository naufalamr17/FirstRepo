import java.util.Scanner;

public class Toserba {
    public static void main(String[] args) {
        String[] kode = new String[20];
        int[] JumlahBeli = new int[20];
        String[] NamaBarang = new String[3];
        int[] HargaAwal = new int[3];
        int[] HargaBarang = new int[3];
        Scanner inputObject = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA\n**************");
        System.out.print("Masukkan Item Barang\t: ");
        int item = inputObject.nextInt();
        for (int i = 0; i < item; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode\t\t: ");
            String dummy = inputObject.nextLine();
            kode[i] = inputObject.nextLine();
            System.out.print("Masukkan Jumlah Beli\t: ");
            JumlahBeli[i] = inputObject.nextInt();

            switch (kode[i]) {
                case "a001":
                    NamaBarang[i] = "Buku";
                    HargaAwal[i] = 3000;
                    HargaBarang[i] = 3000 * JumlahBeli[i];
                    break;
                case "a002":
                    NamaBarang[i] = "Pensil";
                    HargaAwal[i] = 4000;
                    HargaBarang[i] = 4000 * JumlahBeli[i];
                    break;
                case "a003":
                    NamaBarang[i] = "Pulpen";
                    HargaAwal[i] = 5000;
                    HargaBarang[i] = 5000 * JumlahBeli[i];
                    break;
            }
        }

        System.out.println("\nTOKO SERBA ADA\n**************");
        System.out.println(
                "No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar\n============================================================================");
        for (int i = 0; i < item; i++) {
            System.out.println(i + 1 + "\t" + kode[i] + "\t\t" + NamaBarang[i] + "\t\t" + HargaAwal[i] + "\t"
                    + JumlahBeli[i] + "\t\t" + HargaBarang[i]);
        }
        System.out.println("============================================================================");
        int sum = 0;
        for (int Total : HargaBarang) {
            sum += Total;
        }
        System.out.println("Total Bayar = " + sum);
        System.out.println("============================================================================");
    }
}