package Metotlar;

import java.util.Scanner;

public class AsalSayiBulma {
    static String isPrime(int num, int divider, int divisor) {
        if (num % divider == 0) {
            divisor++;
        }
        if (divider == num) {
            if (divisor == 2) {
                return num + " Bir Asal Sayıdır.";
            } else {
                return num + " Bir Asal Sayı Değildir.";
            }
        }
        return isPrime(num, divider + 1, divisor);
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        num = scan.nextInt();
        System.out.print(isPrime(num, 1, 0));
    }
}
