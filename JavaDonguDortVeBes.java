import java.util.Scanner;

public class JavaDonguDortVeBes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, k;

        System.out.print("Sayı limitini belirleyiniz :");
        k = input.nextInt();
        System.out.println("Dördün katları :");
        for (i = 1; i <= k; i *= 4) {

            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("Beşin katları :");
        for (i = 1; i <= k; i *= 5) {
            System.out.print(i + ",");
        }
    }
}
