package Donguler;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int k, total = 0, n = 0, avarage;
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan değeri aldık.
        System.out.print("Lütfen Bir Değer Giriniz : ");
        k = inp.nextInt();
        //0 dan girilen değere kadar olan 3 ve 4'e tam bölünen sayıların ortalamasını alıp yazdırdık.
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                n++;

            }
        }
        avarage = total / n;
        System.out.print("Sıfırdan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması : " + avarage);


    }
}
