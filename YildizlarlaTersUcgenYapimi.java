import java.util.Scanner;

public class YildizlarlaTersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basValue;

        System.out.print("Basamak sayısını giriniz :");
        basValue = input.nextInt();
        int tempBasValue = basValue;

        for (int i = 1; i <= basValue; i++) {
            for ( int k=1;k<=(basValue-tempBasValue);k++) {
                System.out.print(" ");
            }
            for (int n = 1; n <=(2*tempBasValue)-1; n++)
                System.out.print("*");
            tempBasValue--;
            System.out.println();
        }
        System.out.println();
    }
}
