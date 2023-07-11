import java.util.Scanner;

public class DersOrtalamasi {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik, dersSayisi = 5;
        double avarege;

        System.out.print("Matematik notunuzu giriniz :");
        mat = not.nextInt();

        System.out.print("Fizik notunuzu giriniz :");
        fizik = not.nextInt();

        System.out.print("Türkçe notunuzu giriniz :");
        turkce = not.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kimya = not.nextInt();

        System.out.print("Müzik notunuzu giriniz :");
        muzik = not.nextInt();
        if (mat >= 0 && mat <= 100) {
            mat = mat;
        } else {
            mat = 0;
            dersSayisi = dersSayisi - 1;
        }
        if (fizik >= 0 && fizik <= 100) {
            fizik = fizik;
        } else {
            fizik = 0;
            dersSayisi = dersSayisi - 1;
        }
        if (turkce >= 0 && turkce <= 100) {
            turkce = turkce;
        } else {
            turkce = 0;
            dersSayisi = dersSayisi - 1;
        }
        if ((kimya >= 0 && kimya <= 100)) {
            kimya = kimya;
        } else {
            kimya = 0;
            dersSayisi = dersSayisi - 1;
        }
        if ((muzik >= 0 && muzik <= 100)) {
            muzik = muzik;
        } else {
            muzik = 0;
            dersSayisi = dersSayisi - 1;
        }avarege = (mat+fizik+turkce+kimya+muzik)/dersSayisi;
        if (avarege <= 55) {
            System.out.println("Sınıfta kaldınız !");
        } else {
            System.out.println("Tebrikler ! Sınıfınızı geçtiniz !");
        }
        System.out.println("Ortalmanız :" + avarege);
    }
}
