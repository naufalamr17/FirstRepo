public class Lagu {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            if (i - 1 == 0) {
                System.out.println("Tek kotek, kotek kotek\nAnak ayam turunlah berkotek\nAnak ayam Turunlah " + i
                        + "\nMati satu tinggalah induknya");
            } else {
                System.out.println("Tek kotek, kotek kotek\nAnak ayam turunlah berkotek\nAnak ayam Turunlah " + i
                        + "\nMati satu tinggalah " + (i - 1) + "\n");
            }
        }
    }
}