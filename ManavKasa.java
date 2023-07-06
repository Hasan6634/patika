import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        double armutFiyat = 0, elmaFiyat = 0, domatesFiyat = 0,muzFiyat = 0, patlicanFiyat = 0, toplamTutar = 0;

        Scanner kg = new Scanner(System.in);

        System.out.print("Aldığınız armut kilosunu giriniz :");
        armutFiyat = kg.nextDouble()*2.14;

        System.out.print("Aldığınız elma kilosunu giriniz :");
        elmaFiyat = kg.nextDouble()*3.67;

        System.out.print("Aldığınız domates kilosunu giriniz :");
        domatesFiyat = kg.nextDouble()*1.11;

        System.out.print("Aldığınız muz kilosunu giriniz :");
        muzFiyat = kg.nextDouble()*0.95;

        System.out.print("Aldığınız patlıcan kilosunu giriniz :");
        patlicanFiyat = kg.nextDouble()*5.0;

        toplamTutar = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
        System.out.println("Toplam tutar :"+ toplamTutar);

    }
}
