import java.util.Scanner;
public class Vucut_kitle_indeksi {
    public static void main(String[] args) {

        double boy, vucutKitle;
        int kilo;

        Scanner veri = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz :");
        boy = veri.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz :");
        kilo = veri.nextInt();

        vucutKitle = kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz :"+ vucutKitle);


    }

}
