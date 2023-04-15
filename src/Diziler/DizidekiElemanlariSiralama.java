package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        num = inp.nextInt();
        int[] list = new int[num];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Eleman : ");
            list[i] = inp.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));


    }
}
