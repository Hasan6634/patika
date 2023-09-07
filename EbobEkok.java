import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("1. sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("2. sayıyı giriniz :");
        n2 = input.nextInt();
        int i = 1;
        int ebob = 1;
        if (n1 < n2) {
            i = 1;
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
        } else {
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
        }
        int k = 1;
        int ekok = 1;

        while (k <= (n1 * n2)) {
            k++;
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
        }
        System.out.println("EBOB =" + ebob);
        System.out.println("EKOK =" + ekok);

    }
}
