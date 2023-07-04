import java.util.Scanner;
public class Kdv_hesaplama {
    public static void main(String[] args) {

        double tutar, KDVtutar , KDVsatis ,KDVoran;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz :");
        tutar = input.nextDouble();

        KDVoran = ( tutar <= 1000 )?  0.18 : 0.08;
        System.out.println("KDV oranı :" + KDVoran);

        KDVtutar = tutar * KDVoran;
        System.out.println("KDV tutarı :"+ KDVtutar);

        KDVsatis = tutar + KDVtutar;
        System.out.println("KDV'li fiyat :" + KDVsatis);


    }
}
