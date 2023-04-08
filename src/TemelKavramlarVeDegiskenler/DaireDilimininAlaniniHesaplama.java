package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireDilimininAlaniniHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int r,angle ;
        double pi=3.14,alan;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan r ve 𝛼 aldık.
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();
        System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz : ");
        angle = inp.nextInt();

        // Alanı hesaplayıp yazdırdık.
        alan = (pi*(r*r)*angle)/360;
        System.out.println("Dairenin Diliminin Alanı : "+ alan);

        // Formül : (𝜋 * (r*r) * 𝛼) / 360

    }
}
