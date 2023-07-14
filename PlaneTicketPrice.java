import java.util.Scanner;

public class PlaneTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int measure, age, choise;
        double ticketPrice = 0, ageDiscount = 0, roundTripDiscount = 0;

        System.out.print("1-Tek yön  2-Gidiş-dönüş\nYolculuk tipini seçiniz :");
        choise = input.nextInt();

        System.out.print("Gideceğiniz mesafeyi km türünden giriniz :");
        measure = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();

        ticketPrice = measure * 0.10;
        if (age > 0 && age < 12) {
            ageDiscount = ticketPrice / 2;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = ticketPrice * 0.10;
        } else if (age > 24 && age < 65) {
            ageDiscount = 0;
        } else if (age >= 65) {
            ageDiscount = ticketPrice * 0.30;
        } else System.out.println("Hatalı yaş girdiniz");

        if (choise == 1) {
            roundTripDiscount = 0;
        } else if (choise == 2) {
            roundTripDiscount = ticketPrice * 0.20;
        } else System.out.println("Hatalı seçim yaptınız ! (1/2)");
        if (measure>1){
            ticketPrice=ticketPrice;
        }else System.out.println("Hatalı mesafe girdiniz");
        if ((measure > 1) && (age > 1) && (choise>=1&&choise<=2)) {
            ticketPrice = ticketPrice - ageDiscount - roundTripDiscount;
            System.out.println("Bilet fiyatı :" + ticketPrice);
        } else System.out.println("Tekrar deneyiniz");
    }
}