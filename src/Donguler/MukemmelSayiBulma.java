package Donguler;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        int num,total=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        num=inp.nextInt();

        for (int i=1;i<=(num/2);i++){
            if (num%i==0){
                total+=i;
            }
        }
        if (total==num){
            System.out.print(num + " Bir Mükemmel Sayıdır.");
        }else{
            System.out.print(num + " Bir Mükemmel Sayı Değildir.");
        }

    }
}

