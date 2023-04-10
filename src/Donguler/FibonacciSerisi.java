package Donguler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int num;
        int b=0;
        int result=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz : ");
        num = inp.nextInt();
        System.out.print(num + " Elemanlı Fibonacci Serisi : ");

        for(int i =1;i<=num;i++){
            System.out.print(b +" ");
            result +=b;
            b=result-b;
        }
    }
}
