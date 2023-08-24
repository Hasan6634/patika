import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number;
        int basDeger;
        int total=0;

        System.out.print("Sayıyı giriniz :");
        number= input.nextInt();
        int tempnumber=number;
        while (tempnumber!=0){
            basDeger=tempnumber%10;
            total+=basDeger;
            tempnumber/=10;
        }
        System.out.println(number+" sayısının basamak değerleri tolamı :"+total);
    }
}
