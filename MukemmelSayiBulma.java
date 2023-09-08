import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        int total = 0;

        do {
            total = 0;
            System.out.print("Lütfen bir sayı giriniz :");
            number = inp.nextInt();
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                    System.out.println(i);
                }
            }
            if (total == number) {
                System.out.println(number + " sayısı  mükemmel sayıdır.");
            } else System.out.println(number + " sayısı mükemmel sayı değildir.");
        } while (number != 0);
    }
}
