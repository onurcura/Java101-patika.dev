package Donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int num1, num2, ebob = 1, ekok;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        num1 = inp.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        num2 = inp.nextInt();
        int i = 1;
        while (i <= num1) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                ebob = i;
            }
            i++;
        }
        System.out.println("ebob : " + ebob);

        ekok = (num1 * num2) / ebob;
        System.out.println("ekok : " + ekok);


        //Aynı döngüyü tersten yazarsak daha kısa olabilir.(sondan dönerken bulacağı ortak bölen ebobtur -> break.)


    }
}
