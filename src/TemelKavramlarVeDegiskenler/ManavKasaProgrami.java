package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        //Değişkenleri tanımladık
        double armutKg, elmaKg, domKg, muzKg, patKg, armut = 2.14, elma = 3.67, dom = 1.11, muz = 0.95, pat = 5.0, tutar;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan aldıkları meyvelerin kilosunu aldık.
        System.out.println("Hoşgeldiniz! Lütfen Aldığınız Ürünlerin Kaç Kilogramın Olduğunu Giriniz : ");
        System.out.print("Armut : ");
        armutKg = inp.nextDouble();
        System.out.print("Elma : ");
        elmaKg = inp.nextDouble();
        System.out.print("Domates : ");
        domKg = inp.nextDouble();
        System.out.print("Muz : ");
        muzKg = inp.nextDouble();
        System.out.print("Patlıcan : ");
        patKg = inp.nextDouble();

        //Toplam tutarı hesaplayarak yazdırdık.
        tutar = armut * armutKg + elma * elmaKg + dom * domKg + muz * muzKg + pat * patKg;
        System.out.print("Alışveriş Tutarınız : " + tutar + " TL");


    }
}
