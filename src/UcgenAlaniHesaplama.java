import java.util.Scanner;

public class UcgenAlaniHesaplama {
    public static void main(String[] args) {
        // Değişkenleri tanımladık.
        int kenar,kenar1,kenar2;
        double alan,u;

        // Kullanıcıdan kenar uzunluklarını çektik.
        Scanner inp = new Scanner(System.in);
        System.out.println("Üçgenin Kenar Uzunluklarını Giriniz ");
        System.out.print("1. Kenar : ");
        kenar = inp.nextInt();
        System.out.print("2. Kenar : ");
        kenar1 = inp.nextInt();
        System.out.print("3. Kenar : ");
        kenar2 = inp.nextInt();

        // Üçgenin alanını hesaplayıp yazdırdık.
        u = (kenar+kenar1+kenar2)/2;
        alan = Math.sqrt(u*(u-kenar)*(u-kenar1)*(u-kenar2));
        System.out.print("Üçgenin Alanı : " +alan);

        /*
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

                𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

         */



    }
}
