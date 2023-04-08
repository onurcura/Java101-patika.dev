package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int mat, fizik, turkce, kimya, muzik, toplam = 0, n = 0;
        double avarage;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan notları alıp 0-100 aralığında olup olmadığını kontrol ettik.
        System.out.print("Matematik Notunu Giriniz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += mat;
            n += 1;
        }
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += fizik;
            n += 1;
        }
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += turkce;
            n += 1;
        }
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += kimya;
            n += 1;
        }
        System.out.print("Müzik Notunu Giriniz : ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += muzik;
            n += 1;
        }

        //Ortalamaya göre sınıfı geçme durumunu yazdırdık.
        avarage = toplam / n;
        if (avarage >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz !");
        } else {
            System.out.println("Sınıfta Kaldınız !");
        }
        System.out.println("Not Ortalamanız : " + avarage);

    }
}
