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


/*
if (game[n + 1] == 0) {
                n++;
                if (n == game.length - 1) {
                    break;
                }
            } else {
                break;
            }
 */

/*for(int i = 0;i<game.length;){
                 n = i;
                 if (game[n+1]==0){
                     i++;
                 }else if(game[n+leap]==0){
                     i +=leap;
                 }else{
                     break;
                 }

            }
            break;
        000110011011
 */