import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double yol , fiyat ,acilis = 10 ;

        System.out.print("Gidilen yolu giriniz :");
        yol = girdi.nextInt();

        fiyat = (yol * 2.20) + acilis;
        fiyat = (fiyat < 20) ? 20 : fiyat;
        System.out.println("Ödenecek ücret :"+ fiyat);
    }
}
