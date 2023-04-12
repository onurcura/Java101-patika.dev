package Donguler;

import java.util.Scanner;

public class AsalSayiBulmaDongu {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        num=inp.nextInt();
        System.out.print("Asal Sayılar : ");
        for (int i=1;i<=num;i++){
            int total=0;
            for (int k=1;k<i;k++){
                if (i%k==0){
                    total+=k;
                }
            }
            if (total==1){
                System.out.print(i +",");
            }
        }
        System.out.print("\b" + ".");


    }
}
