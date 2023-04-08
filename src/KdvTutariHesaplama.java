import java.util.Scanner;
public class KdvTutariHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        double tutar,kdvTutar,kdvTutar2,sonuc,kdv=0.18,kdv1=0.08;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Bilgileri Çektik
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = inp.nextDouble();

        // Kdv tutarını 1000 TL altı ve üzeri olması durumuna göre hesaplayıp yazdırdık.
        kdvTutar= tutar*kdv;
        kdvTutar2= tutar*kdv1;
        sonuc = tutar<1000 ? tutar+kdvTutar : tutar+kdvTutar2;
        System.out.println("Tutar : " + tutar);
        System.out.print("KDV Tutarı : ");
        System.out.println(tutar<1000 ? kdvTutar : kdvTutar2);
        System.out.print("Toplam Tutar : " +sonuc);


    }
}
