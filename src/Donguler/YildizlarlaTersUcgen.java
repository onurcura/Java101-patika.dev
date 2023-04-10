package Donguler;

import java.util.Scanner;

public class YildizlarlaTersUcgen {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üçgenin Kaç Satır Olacağını Giriniz : ");
        num = inp.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int k = num - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
