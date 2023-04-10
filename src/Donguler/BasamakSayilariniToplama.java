package Donguler;

import java.util.Scanner;

public class BasamakSayilariniToplama {
    public static void main(String[] args) {
        int number, total = 0, n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        number = inp.nextInt();

        while (number != 0) {
            n = number % 10;
            number /= 10;
            total += n;
        }
        System.out.print("Girdiğiniz sayının basamakları toplamı : " + total);

    }
}
