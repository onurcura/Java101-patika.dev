package Diziler;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " +Arrays.toString(list));
        System.out.println("Tekrar eden sayılar : ");
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    counter++;
                }
            }
            System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            i = i + counter - 1;
        }
    }
}
