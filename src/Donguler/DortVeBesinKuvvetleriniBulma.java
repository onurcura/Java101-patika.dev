package Donguler;

import java.util.Scanner;

public class DortVeBesinKuvvetleriniBulma {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Bir Değer Giriniz : ");
        n = inp.nextInt();

        System.out.print("Girilen Sayıya Kadar Olan 4'Ün Kuvvetleri : ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + ",");
        }

        System.out.print("\b");
        System.out.println();

        System.out.print("Girilen Sayıya Kadar Olan 4'Ün Kuvvetleri : ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + ",");
        }
        System.out.print("\b");


    }
}
