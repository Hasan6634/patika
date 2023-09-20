import java.util.Scanner;

public class RecursiveMetoduIleUsALma {
    static int usAlma(int taban, int us) {
        int result = 1;
        for (int i = 1; i <= us; i++) {
            result *= taban;
        }
        System.out.println("Sonuç =" + result);
        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            int taban;
            int us;
            int result = 1;
            System.out.print("Taban değerini giriniz :");
            taban = input.nextInt();

            System.out.print("Üs değerini giriniz :");
            us = input.nextInt();

            if (us == 0) {
                result = 1;
                System.out.println("Sonuç ="+result);
            } else usAlma(taban, us);
        }
    }
}
