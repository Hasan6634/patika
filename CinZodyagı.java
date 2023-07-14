import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int birthdayyear;
        int remainYear;
        boolean isError = false;
        String burc = " ";

        System.out.print("Doğum yılınızı giriniz :");
        birthdayyear = inp.nextInt();

        remainYear = birthdayyear % 12;

        if (remainYear == 0) {
            burc = "Maymun";
        } else if (remainYear == 1) {
            burc = "Horoz";
        } else if (remainYear == 2) {
            burc = "Köpek";
        } else if (remainYear == 3) {
            burc = "Domuz";
        } else if (remainYear == 4) {
            burc = "Fare";
        } else if (remainYear == 5) {
            burc = "Öküz";
        } else if (remainYear == 6) {
            burc = "Kaplan";
        } else if (remainYear == 7) {
            burc = "Tavşan";
        } else if (remainYear == 8) {
            burc = "Ejderha";
        } else if (remainYear == 9) {
            burc = "Yılan";
        } else if (remainYear == 10) {
            burc = "At";
        } else if (remainYear == 11) {
            burc = "Koyun";
        } else {
            isError = false;
        }
        if ((isError) || (birthdayyear<0)) {
            System.out.println("Hatalı giriş yaptınız !");
        } else {
            System.out.println("Çin Zodyağı Burcunuz :" + burc);
        }
    }
}
