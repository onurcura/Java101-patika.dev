package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        int dist, age, type;
        double pricePerKm = 0.1, discount1 = 0.5, discount2 = 0.1, discount3 = 0.3, discount4 = 0.2, total;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen gideceğiniz mesafeyi km cinsinden giriniz : ");
        dist = inp.nextInt();
        System.out.print("Lütfen yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Lütfen yolculuk tipini giriniz(1-> Tek Yön ,2-> Gidiş Dönüş) : ");
        type = inp.nextInt();

        total = dist * pricePerKm;

        if (dist > 0 && age > 0 && (type == 1 || type == 2)) {
            if (age < 12) {
                total -= total * discount1;
            } else if (age < 24) {
                total -= total * discount2;
            } else if (age > 65) {
                total -= total * discount3;
            }
            if (type == 2) {
                total -= total * discount4;
                total *= 2;
            }
            System.out.print("Toplam Tutar : " + total + " TL");


        } else {
            System.out.print("Hatalı bir değer girdiniz. Lütfen tekrar deneyiniz.");
        }


    }
}
