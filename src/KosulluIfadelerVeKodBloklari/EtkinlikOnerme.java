package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Havanın Kaç Derece Olduğunu Giriniz : ");
        c = inp.nextInt();

        if (c < 5) {
            System.out.print("Kayak Yapabilirsiniz. ");
        } else if (c < 10) {
            System.out.print("Sinemaya Gidebilirsiniz. ");
        } else if (c <= 15) {
            System.out.print("Sinemaya Veya Pikniğe Gidebilirsiniz. ");
        } else if (c <= 25) {
            System.out.println("Pinkiğe Gidebilirsiniz.");
        } else {
            System.out.print("Yüzmeye Gidebilirsin. ");
        }
        System.out.print("İyi Eğlenceler !");

    }
}
