import java.util.Scanner;

public class RecursiveDenemeArtiEksiBes {

    static void minus(int a,int b) {
        if (a > 0) {
            System.out.println(a);
            minus(a - 5,b);
        } else
            plus(a,b);
    }
    static void plus(int a,int b){
        if (b>=a){
            System.out.println(a);
            plus(a+5,b);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;

        System.out.println("Sayı giriniz :");
        a = input.nextInt();
        int b=a;
        minus(a,b);

    }
}
