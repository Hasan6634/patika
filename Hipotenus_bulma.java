import java.util.Scanner;

public class Hipotenus_bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //a = 1. kısa kenar b = 2. kısa kenar c = hipotenüs

        int a,b;
        double c;

        System.out.print("Birinci kenarı giriniz :");
        a = input.nextInt();

        System.out.print("İkinci kenarı giriniz :");
        b = input.nextInt();

        c    = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs :"+c);

    }
}
