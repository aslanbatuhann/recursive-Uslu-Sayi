import java.util.Scanner;

public class Main {
    static int usHesap(int a, int b) {
        //a=taban b=üs
        if (b == 0)
            return 1;
        else if (a == 1)
            return 1;
        else
            return a * usHesap(a, b - 1);
    }

    public static void main(String[] args) {
        int taban, us;

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        taban = scan.nextInt();
        System.out.print("Taban değeri giriniz : ");
        us = scan.nextInt();

        System.out.print(usHesap(taban, us));
    }
}