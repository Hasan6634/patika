import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod alma işlemi =" + result);
        return result;

    }

    static void calc(int a, int b) {
        System.out.println("Alan =" + (a * b));
        System.out.println("Çevre =" + (2 * (a + b)));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        int b;
        int select;
        System.out.println("1-Mod Alma İşlemi \n" + "2-Dikdörgen Alan ve Çevre Hesabı");

        while (true) {
            System.out.print("Yapmak istediğiniz işlemi Seçiniz :");
            select = inp.nextInt();

            if (select != 1 && select != 2) {
                break;
            } else {


                System.out.print("İlk sayıyı giriniz :");
                a = inp.nextInt();

                System.out.print("İkinci sayıyı giriniz :");
                b = inp.nextInt();

                switch (select) {
                    case 1:
                        mod(a, b);
                        break;
                    case 2:
                        calc(a, b);
                        break;
                }
            }
        }
    }
}
