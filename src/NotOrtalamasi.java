import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        // Değişkenleri tanımladık.
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan verileri aldık.
        System.out.print("Matematik Notunu Giriniz : ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunu Giriniz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        muzik = inp.nextInt();

        // Ortalamayı hesaplayıp sınıf geçme durumuyla beraber çıkarttık.
        int ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız : "+ort);
        System.out.println(ort>=60 ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!");

    }
}
