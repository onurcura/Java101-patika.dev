package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DizideYakinSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int num = inp.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        int min = list[0];
        int max = list[(list.length - 1)];
        for (int i : list) {
            if (i < max && i > num) {
                max = i;
            }
            if (i > min && i < num) {
                min = i;
            }
        }

        System.out.println("Girilen Sayı : " + num);
        System.out.println("Listede girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Listede girilen sayıdan büyük en yakın sayı : " + max);
    }
}
