import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1.Sayıyı giriniz :");
        a = input.nextInt();

        System.out.print("2.Sayıyı giriniz :");
        b = input.nextInt();

        System.out.print("3.Sayıyı giriniz :");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            }
        }
        if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c");
            }
        } else if (b < a) {
            System.out.println("c<b<a");
        }
    }
}

