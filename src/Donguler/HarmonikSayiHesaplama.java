package Donguler;

import java.util.Scanner;

public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        int n;
        double result = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Hesaplamak İstediğiniz Harmonik Serinin n Değerini Giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        System.out.print("Sonuç : " + result);
    }
}
