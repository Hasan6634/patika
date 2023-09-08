
import java.util.Scanner;

public class MinMaxSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sayi = 1;
        int max = 1;
        int min = 1;
        System.out.print("Kaç tane sayı girecekseniz? :");
        number = input.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.print(i + " . sayıyı giriniz :");
            sayi = input.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }
            i++;
        }
        System.out.println("En büyük sayı :" + max);
        System.out.println("En küçük sayı :" + min);
    }
}
