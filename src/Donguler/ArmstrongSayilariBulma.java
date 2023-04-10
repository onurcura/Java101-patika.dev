package Donguler;

import java.util.Scanner;

public class ArmstrongSayilariBulma {
    public static void main(String[] args) {
        int number, tempNumber, digNumber, digValue, total, result;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        number = inp.nextInt();

        System.out.print("Girdiğiniz sayıya kadar Armstrong sayısı olan sayılar : ");
        for (int i = 1; i <= number; i++) {
            digNumber = 0;
            result = 0;
            tempNumber = i;
            while (tempNumber != 0) {
                tempNumber /= 10;
                digNumber++;
            }
            tempNumber = i;
            while (tempNumber != 0) {
                digValue = tempNumber % 10;
                total = 1;
                for (int j = 1; j <= digNumber; j++) {
                    total *= digValue;
                }
                result += total;
                tempNumber /= 10;

            }
            if (result == i) {
                System.out.print(i + ",");
            }

        }
        System.out.print("\b" + ".");


    }
}
