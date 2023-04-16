package Diziler;

import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game, int index) {
        if (index < 0 || game[index] == 1) {
            return false;
        }
        if (index + 1 > game.length - 1 || index + leap >= game.length) {
            return true;
        }
        game[index] = 1;
        return canWin(leap, game, index - 1) || canWin(leap, game, index + 1) || canWin(leap, game, index + leap);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        while (num-- > 0) {
            int num1 = inp.nextInt();
            int leap = inp.nextInt();
            int[] game = new int[num1];
            for (int i = 0; i < game.length; i++) {
                game[i] = inp.nextInt();
            }
            if (canWin(leap, game, 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }

    }
}
