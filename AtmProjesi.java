
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName;
        String password;
        int right = 3;
        int select;
        double balance = 1500;

        while (right > 0) {
            System.out.print("Kullancı adınızı giriniz :");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz :");
            password = input.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merahaba ! Hasan Bankasına Hoş Geldiniz");
                do {
                    System.out.println("1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktarını giriniz :");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarını giriniz :");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");

                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere. Hoşçakalın!");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütefen bankanızla iletişime geçiniz");
                } else
                    System.out.println("Hatalı giriş yaptınız.Kalan hakkınız " + right + " Lütfen tekrar deneyiniz.");
            }
        }
    }
}
