package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int plus(int x, int y) {
        return x+y;
    }

    static int minus(int x, int y) {
        return x-y;
    }

    static int times(int x, int y) {
        return x*y;
    }

    static int divided(int x, int y) {
        return x/y;
    }

    static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    static int fakt(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    static int mod(int x, int y) {
        return x%y;
    }

    static int rectacevre(int x, int y) {
        return 2 * (x + y);
    }

    static int rectalan(int x, int y) {
        return x * y;
    }


    public static void main(String[] args) {
        int select, num1 , num2=0 ;
        Scanner inp = new Scanner(System.in);
        String menu = "1-Toplama İşlemi\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üslü Sayı Hesaplama\n"
                + "6-Faktöriyel Hesaplama\n"
                + "7-Mod Alma\n"
                + "8-Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0-Çıkış yap";
        System.out.println(menu);


        while (true) {
            System.out.print("Yapmak istediğiniz İşlemi Seçiniz : ");
            select = inp.nextInt();
            if (select == 0) {
                break;
            }
            if (select == 6) {
                System.out.print("1. Sayıyı Giriniz : ");
                num1 = inp.nextInt();
            } else {
                System.out.print("1. Sayıyı Giriniz : ");
                num1 = inp.nextInt();
                System.out.print("2. Sayıyı Giriniz : ");
                num2 = inp.nextInt();
            }

            switch (select) {
                case 1:
                    System.out.println("Sonuç : " + plus(num1, num2));
                    break;
                case 2:
                    System.out.println("Sonuç : " + minus(num1, num2));
                    break;
                case 3:
                    System.out.println("Sonuç : " + times(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Bir Sayı 0'a Bölünemez.");
                    } else {
                        System.out.println("Sonuç : " + divided(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("Sonuç : " + power(num1, num2));
                    break;
                case 6:
                    System.out.println("Sonuç : " + fakt(num1));
                    break;
                case 7:
                    System.out.println("Sonuç : " + mod(num1, num2));
                    break;
                case 8:
                    System.out.println("Çevre : " + rectacevre(num1, num2) + " Alan : " + rectalan(num1, num2));
                    break;
                default:
                    System.out.println("Yanlış Bir Değer Girdiniz. Tekrar Deneyiniz.");

            }


        }
        System.out.print("İyi Günler.");
    }
}
