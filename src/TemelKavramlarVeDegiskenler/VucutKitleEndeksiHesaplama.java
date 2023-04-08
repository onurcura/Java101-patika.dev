package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        double size, weight, indeks;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan boy ve kiloyu aldık.
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        size = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Kilogram Cinsinden Giriniz : ");
        weight = inp.nextDouble();

        //Vücut kitle indeksiniz hesaplayıp yazdırdık.
        indeks = weight / (size * size);
        System.out.println("Vücut Kitle Endeksiniz : " + indeks);

    }
}
