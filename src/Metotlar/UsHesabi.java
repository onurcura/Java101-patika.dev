package Metotlar;

import java.util.Scanner;

public class UsHesabi {
    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return power(x, y - 1) * x;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        num1 = inp.nextInt();
        System.out.print("2. Sayı : ");
        num2 = inp.nextInt();
        System.out.println("Sonuç : " + power(num1, num2));


    }
}
