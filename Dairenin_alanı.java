import java.util.Scanner;

public class Dairenin_alanı {
    public static void main(String[] args) {

        int r, a;
        double alan, piSayisi = 3.14;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz :");
        r = girdi.nextInt();

        System.out.print("Dairenin merkez açısının ölçüsünü giriniz :");
        a = girdi.nextInt();

        alan = (piSayisi*(r*r)*a)/360;
        System.out.println("Dairenin alanı :"+ alan);

    }
}
