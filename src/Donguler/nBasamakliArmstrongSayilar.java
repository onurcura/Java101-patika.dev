package Donguler;

import java.util.Scanner;

public class nBasamakliArmstrongSayilar {
    public static void main(String[] args) {
        int number1 = 1, number2 = 1, tempNumber, digNumber, digValue, total, result;
        Scanner inp = new Scanner(System.in);
        //int/int yaparsak sonucu int cinsinden verir.2451/10=245
        System.out.print("Lütfen Bulmak İstediğiniz Armstrong Sayılarının Kaç Basamaklı Olacağını Giriniz : ");
        digNumber = inp.nextInt();
        for (int i = 1; i <= digNumber; i++) {
            number1 *= 10;
            if (i < digNumber) {
                number2 *= 10;
            }
        }

        System.out.print(digNumber + " Basamaklı Armstrong Sayıları : ");
        for (int i = number2; i < number1; i++) {
            result = 0;
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
