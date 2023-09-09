
public class AsalSayiProgrami1_100 {
    public static void main(String[] args) {

        int counter = 0;

        for (int n = 1; n <= 100; n++) {
            counter = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i != 0) {
                    continue;
                }
                counter++;
            }
            if (counter == 2) {
                System.out.println(n);
            }
        }
    }
}
