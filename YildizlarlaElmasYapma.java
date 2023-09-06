import java.util.Scanner;

public class YildizlarlaElmasYapma {
    public static void main(String[] args) {
        Scanner yildiz = new Scanner(System.in);
        int n=4;

        int tempn=n;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("*");
                if (j == 9) {
                    break;
                }
            }
            System.out.println();
        }
        for (int p = 1; p <= n; p++) {
            for (int a = 1; a <= p; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * tempn) - 1; b++) {
                System.out.print("*");

            }   tempn = tempn - 1;
            System.out.println();
        }
    }
}


