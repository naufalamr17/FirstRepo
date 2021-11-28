import java.util.Scanner;

public class NestedLoops2 {
    public static void main(String[] args) {
        Scanner inpObject = new Scanner(System.in);

        System.out.print("Input Lebar : ");
        int Lebar = inpObject.nextInt();

        for (int i = 1; i <= Lebar; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}