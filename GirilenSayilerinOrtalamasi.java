import java.util.Scanner;

public class GirilenSayilerinOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k, toplam = 0, count = 0;
        double average=0;
        System.out.print("Sayiyi giriniz :");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                if (i==0)
                    continue;
                toplam += i;
                count++;
                average = toplam / count;
                System.out.println("Sayılar :"+i);
            }
        }
        System.out.println("Ortalama =" + average);
    }
}
