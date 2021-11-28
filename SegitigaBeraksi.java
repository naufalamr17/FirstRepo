import java.util.Scanner;

class Segitiga {
    private int lebar;

    public Segitiga(int lebar) {
        this.lebar = lebar;
    }

    public String gambarSegitiga() {
        String r = "";
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= i; j++) {
                r = r + "[]";
            }
            r = r + "\n";
        }
        return r;
    }
}

public class SegitigaBeraksi {
    public static void main(String[] args) {
        Scanner inpObject = new Scanner(System.in);

        System.out.print("Input Lebar Segitiga Kecil : ");
        int lebar = inpObject.nextInt();
        Segitiga kecil = new Segitiga(lebar);
        System.out.println(kecil.gambarSegitiga());

        System.out.print("Input Lebar Segitiga Besar : ");
        lebar = inpObject.nextInt();
        Segitiga besar = new Segitiga(lebar);
        System.out.println(besar.gambarSegitiga());
    }
}