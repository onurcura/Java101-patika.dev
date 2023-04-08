package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int num1, num2, select;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan girmek istediği değerleri ve yapmak istediği işlemi aldık.
        System.out.print("İlk Sayıyı Giriniz : ");
        num1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = inp.nextInt();

        //Kullanıcının girdiği değere göre işlemi yaptırıp yazdırdık.
        switch (select) {
            case 1:
                System.out.println("Sonuç : " + (num1 + num2));
                break;
            case 2:
                System.out.print("Sonuç : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç : " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Sonuç : " + (num1 / num2));
                } else {
                    System.out.print("Bir Sayı 0'a Bölünemez!");
                }

                break;
            default:
                System.out.println("Hatalı Bir Giriş Yaptınız!");
        }

    }
}
