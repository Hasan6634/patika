import java.util.Scanner;

public class PolindromSayiBulma {

    static boolean isPolindrom(int number) {
        int temp = number;
        int lastNumber = 0;
        int reverseNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;

        System.out.print("Sayıyı giriniz :");
        number=input.nextInt();

        if (isPolindrom(number)==true){
            System.out.println(number+" Polindrom bir sayıdır.");
        }else {
            System.out.println(number+" Polindrom bir sayı değildir.");
        }
    }
}
