import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int year;
        double kalan, kalan100;

        System.out.print("Seneyi giriniz :");
        year = inp.nextInt();

        kalan = year % 4;
        kalan100 = year % 100;
        if (kalan == 0) {
            if (kalan100 == 0) {
                System.out.println(year+" bir artık yıl değildir.");
            } else {
                System.out.println(year+" bir artık yıldır.");
            }
        }else {
            System.out.println(year+" bir artık yıl değildir.");
        }

    }

}

