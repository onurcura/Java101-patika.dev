package Donguler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, total1 = 1, total2 = 1, total3 = 1, c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Hesaplamak istediğiniz kombinasyonun C(n,r) olacak şekilde sırasıyla n ve r değerlerini giriniz : ");
        n = inp.nextInt();
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }

        for (int i = 1; i <= r; i++) {
            total2 *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            total3 *= i;
        }
        c = total1 / (total2 * total3);
        System.out.print("C(n,r) = " + c);

    }
}
