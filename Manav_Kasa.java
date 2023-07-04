import java.util.Scanner;
public class Manav_Kasa {
    public static void main(String[] args) {

        double Armut = 2.14, Elma = 3.67, Domates = 1.11,Muz = 0.95, Patlican = 5.0, toplamTutar = 0;

        Scanner kg = new Scanner(System.in);

        System.out.print("Aldığınız armut kilosunu giriniz :");
        Armut = kg.nextDouble();
        Armut = Armut*2.14;

        System.out.print("Aldığınız elma kilosunu giriniz :");
        Elma *= kg.nextDouble();

        System.out.print("Aldığınız domates kilosunu giriniz :");
        Domates *= kg.nextDouble();

        System.out.print("Aldığınız muz kilosunu giriniz :");
        Muz *= kg.nextDouble();

        System.out.print("Aldığınız patlıcan kilosunu giriniz :");
        Patlican *= kg.nextDouble();

        System.out.println("Armut "+ Armut + " Elma "+Elma+" Domates "+Domates+" Muz "+Muz+" Patlıcan "+Patlican);

        toplamTutar = Armut + Elma + Domates + Muz + Patlican;
        System.out.println("Toplam tutar :"+ toplamTutar);







    }
}
