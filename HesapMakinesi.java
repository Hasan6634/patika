import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("Birinci sayıyı giriniz :");
        n1 = number.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        n2 = number.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Hangi işlemi yapmak istiyorsunuz :");

        select = number.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam = " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cıkarma =" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma =" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme :" + (n1 / n2));
                } else System.out.println("Bir sayı 0 ile bölünemez");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. \nTekrar deneyiniz (1-4)");
        }
    }
}

