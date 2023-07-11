import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password, karar;

        System.out.print("Kullanıcı adınızı giriniz :");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz :");
        password = inp.nextLine();

        if ( password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else {
                System.out.println("Hatalı giriş yaptınız ! Şifrenizi sıfırlamak ister misiniz ?");
                System.out.println("yes or no");
                karar = inp.nextLine();
                if (karar.equals("yes")) {
                    System.out.print("Yeni şifrenizi giriniz :");
                    password = inp.nextLine();
                    if (password.equals("java123")) {
                        System.out.println("Yeni şifre eski şifreyle aynı olamaz ! Şifre oluşturulamadı !\nLütfen başka şifre giriniz");
                    } else System.out.println("Şifreniz başarıyla oluşturuldu");
                }
            }
        }
    }