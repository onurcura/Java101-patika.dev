package Donguler;

import java.util.Scanner;

public class MinMaxSayiBulma {
    public static void main(String[] args) {
        int n, num, minnum = 0, maxnum = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            num = inp.nextInt();
            if (i == 1) {
                minnum = num;
                maxnum = num;
            }
            if (num < minnum) {
                minnum = num;
            } else if (num > maxnum) {
                maxnum = num;
            }
        }
        System.out.println("En Küçük Sayı : " + minnum);
        System.out.println("En Küçük Sayı : " + maxnum);

        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

    }
}
