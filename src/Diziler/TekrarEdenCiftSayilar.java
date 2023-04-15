package Diziler;

import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {

        int[] list = {6, 0, 3, 2, 6, 5, 3, 5, 8, 14, 9, 8, 14, 8};
        Arrays.sort(list);
        int num = list[list.length - 1];
        int rnum = list[list.length - 1];
        System.out.print("Listede Tekrar Eden Sayılar : ");
        for (int i : list) {
            if (i == num && i % 2 == 0) {
                if (i != rnum) {
                    System.out.print(i + " ");
                }
                rnum = i;
            }
            num = i;
        }
    }
}
