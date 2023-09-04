import java.util.Scanner;

public class HarmonikHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double result = 0;

        System.out.print("Harmonik sayıyı giriniz :");
        n = input.nextInt();

        for (double i = 1.0; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println("Sonuç :"+result);
    }
}
