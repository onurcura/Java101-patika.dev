package Diger;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        int right = 0;
        int selected;
        boolean isWrong = false;
        boolean isWin = false;
        int[] answers = new int[5];

        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);

        while (right < 5) {
            System.out.print("Bir Sayı Giriniz : ");
            selected = scan.nextInt();
            if (selected < 0 || selected > 99) {
                if (!isWrong) {
                    System.out.println("Hatalı bir giriş yaptınız. Girilen değer aralığı 0-100 olmalıdır.");
                    System.out.println("Bir sonraki hatalı değer girişinizde hakkınızdan düşülecektir.");
                    isWrong = true;
                } else {
                    right++;
                    System.out.println("Hatalı bir giriş yaptınız. Girilen değer aralığı 0-100 olmalıdır.");
                    if (right != 5) {
                        System.out.println("Kalan hakkınız : " + (5 - right));
                    }
                }
            } else {
                if (selected == number) {
                    answers[right] = selected;
                    isWin = true;
                    break;
                } else {
                    answers[right] = selected;
                    right++;
                    if (selected > number) {
                        System.out.println(selected + " sayısı aradığınız sayıdan büyük.");
                    } else {
                        System.out.println(selected + " sayısı aradığınız sayıdan küçük.");
                    }
                    if (right != 5) {
                        System.out.println("Kalan hakkınız : " + (5 - right));
                    }
                }
            }
        }
        if (isWin) {
            System.out.println("Tebrikler ! Sayıyı doğru tahmin ettiniz.");
        } else {
            System.out.println("Kaybettiniz ! Aradığınız sayı : " + number);
        }
        System.out.print("Tercihleriniz : ");
        for (int i : answers) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
