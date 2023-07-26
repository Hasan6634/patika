import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n, r, nFaktoriyel = 1, rFaktoriyel = 1, total = 0, nrFaktoriyel = 1;
        System.out.print("Küme eleman sayısını giriniz :");
        n = inp.nextInt();

        System.out.print("Oluşturulacak farklı gurup sayısını giriniz :");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel * i;
        }
        for (int i = 1; i <= r; i++) {
            rFaktoriyel = rFaktoriyel * i;
        }
        for (int i = 1; i <= n - r; i++) {
            nrFaktoriyel = nrFaktoriyel * i;
        }
        total=nFaktoriyel/(rFaktoriyel*nrFaktoriyel);
        System.out.println(n+"'in "+r+"'li "+"kombinasyonu ="+total);
    }
}
