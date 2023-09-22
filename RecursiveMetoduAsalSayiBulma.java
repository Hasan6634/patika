import java.util.Scanner;

public class RecursiveMetoduAsalSayiBulma {

    static boolean asalSayi(int number,int mod) {
        if (number==1){
            return false;
        }
        if (number == 2) {
            return true;
        }
        int result = number % mod;
        if (mod==1){
            return true;
        }
        if (result == 0) {
            return false;
        }
        return asalSayi(number,mod-1);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz :");
        number = input.nextInt();
        System.out.println(asalSayi(number,number-1)?number+" sayısı asaldır":number+" sayısı asal değildir");

    }
}
