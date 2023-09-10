import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int number;
        int n1 = 0;
        int n2 = 1;
        int total = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci elaman sayısını giriniz :");
        number = inp.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(n1);
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
    }
}
