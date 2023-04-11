package Metotlar;

import java.util.Scanner;

public class FibonacciSerisi {
    static int fib(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaçıncı Fibonacci Serisi Elemanını Bulmak İstiyorsunuz : ");
        int num = inp.nextInt();
        System.out.print(num + ". Eleman : " + fib(num));
    }
}
