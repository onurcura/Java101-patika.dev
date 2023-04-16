package Diziler;

import java.util.Scanner;

public class Solution {
    static boolean canWin(int leap,int[] game) {
        int n = 0;
        while (true) {
            if(game[n+leap]==0){
                n+=leap;
            }else{
                n-=leap;
                break;
            }
        }

        if ((n == game.length - 1) || (n + leap) >= game.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        for (int i = 1; i <= num; i++) {
            int num1 = inp.nextInt();
            int leap = inp.nextInt();
            int[] game = new int[num1];
            for (int j = 0; j < game.length; j++) {
                game[j] = inp.nextInt();
            }
            if (canWin(leap, game)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
