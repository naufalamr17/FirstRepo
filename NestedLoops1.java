import java.util.Scanner;

public class NestedLoops1 {
    public static void main(String[] args) {
        Scanner inpObject = new Scanner(System.in);

        System.out.print("Input Baris : ");
        int row = inpObject.nextInt();
        System.out.print("Input Kolom : ");
        int column = inpObject.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}