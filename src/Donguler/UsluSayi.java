package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n, r, total = 1;
        Scanner inp = new Scanner(System.in);

        System.out.println("Hesaplamak istediğiniz değeri n^r olacak şekilde sırasıyla n ve r değerlerini giriniz : ");
        n = inp.nextInt();
        r = inp.nextInt();

        for (int i = 1; i <= r; i++) {
            total *= n;
        }

        System.out.print(n + "^" + r + " işleminin sonucu : " + total);

    }
}
