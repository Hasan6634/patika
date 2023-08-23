import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int k;
        int total = 1;
        System.out.print("Üssü alıncak sayısyı giriniz :");
        n = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz :");
        k = input.nextInt();

        for (int i = 1; i<=k; i++){
            total*=n;

        }
        System.out.println("Cevap :"+ total);
    }
}
