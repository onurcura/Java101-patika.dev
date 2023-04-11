package Metotlar;

import java.util.Scanner;

public class PalindromSayilar {
    static int pal(int num) {
        int dig, revNum = 0;
        while (num != 0) {
            dig = num % 10;
            revNum = (revNum * 10) + dig;
            num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;

        System.out.print("Bir Sayı Giriniz : ");
        num = inp.nextInt();
        if (num == pal(num)) {
            System.out.print(num + " Bir Palindrom Sayıdır.");
        } else {
            System.out.print(num + " Bir Palindrom Sayı Değildir.");
        }

    }
}
