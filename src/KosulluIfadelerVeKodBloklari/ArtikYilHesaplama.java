package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        // Değişkenleri tanımladık.
        int year, n;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan yılımızı aldık.
        System.out.print("Lütfen Yıl Giriniz : ");
        year = inp.nextInt();

        /*4'e tam bölünenler döngüye girer. Eğer 100'ün katı fakat 400'ün katı değilse artık yıl değildir.
        Geri kalan 4'e bölünenler artık yıldır.*/
        n = year % 4;
        if (n == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + " Bir artık yıldır.");
                } else {
                    System.out.print(year + " Bir artık yıl değildir.");
                }
            } else {
                System.out.print(year + " Bir artık yıldır.");
            }

        } else {
            System.out.print(year + " bir artık yıl değildir.");
        }

    }
}
