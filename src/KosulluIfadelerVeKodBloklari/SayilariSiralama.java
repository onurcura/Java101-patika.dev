package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan 3 Sayı aldık.
        System.out.print("1. Sayi : ");
        num1 = inp.nextInt();
        System.out.print("2. Sayi : ");
        num2 = inp.nextInt();
        System.out.print("3. Sayi : ");
        num3 = inp.nextInt();

        //Önce ilk sayının en küçük değilse ikinci değilse üçüncünün en küçük olacağı şekilde bloğu yazdırdık.
        if ((num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.print(num1 + "<" + num2 + "<" + num3);
            } else {
                System.out.print(num1 + "<" + num3 + "<" + num2);
            }
        } else if (num2 < num3) {
            if (num1 < num3) {
                System.out.print(num2 + "<" + num1 + "<" + num3);
            } else {
                System.out.print(num2 + "<" + num3 + "<" + num1);
            }
        } else {
            if (num1 < num2) {
                System.out.print(num3 + "<" + num1 + "<" + num2);
            } else {
                System.out.print(num3 + "<" + num2 + "<" + num1);
            }
        }

    }
}
