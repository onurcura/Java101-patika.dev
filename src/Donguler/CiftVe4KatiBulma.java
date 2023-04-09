package Donguler;

import java.util.Scanner;

public class CiftVe4KatiBulma {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Bir Değer Giriniz : ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.print("Girdiğiniz sayıya kadar olan çift ve 4 ün katları olan sayıların toplamı : " + total);

    }
}
