package Metotlar;

import java.util.Scanner;

public class DeseneGoreMetot {

    static int metot(int x, int y, int z) {
        if (x > z) {
            return z;
        }
        System.out.print(x + " ");
        x -= y;
        if (x <= 0) {
            y = -5;
        }
        return metot(x, y, z) + y;
    }

    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();
        metot(num, 5, num);
    }
}
