package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        double perKm = 2.2, dist, total;
        int o = 10;

        //Kullanıcıdan mesafeyi aldık.
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Gidilen Mesafeyi Giriniz : ");
        dist = inp.nextDouble();

        //Girilen mesafeye göre ücreti hesapladık.(Açılış 10 TL , min ücret 20 TL)
        total = o + (dist * perKm);
        total = (total > 20) ? total : 20;
        System.out.println("Ödeyeceğiniz Tutar : " + total + " TL");

    }
}
