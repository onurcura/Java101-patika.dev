package Siniflar.OgrenciNotSistemi;

import java.util.Scanner;

public class Menu {
    Scanner inp = new Scanner(System.in); //int
    Scanner input = new Scanner(System.in);  //String
    int select, n, note, s;
    String id, pw, search;
    boolean isLogin = false;
    boolean choice;
    //Müdür id=müdür,pw=müdürümben123
    //Öğretmen id=öğretmen,pw=hocam123
    //s1 id=Onur,pw=128 s2 id=fuat,pw150 s3 id=doğcan,pw=125

    Menu() {

    }

    void start() {
        System.out.println("1-Öğrenci Girişi\n2-Öğretmen Girişi\n3-Çıkış Yap");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        this.select = inp.nextInt();
        if (select != 1 && select != 2 && select != 3) {
            System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz.");
            start();
        }
    }

    void login() {

        System.out.print("Kullanıcı Adı : ");
        this.id = input.nextLine();
        System.out.print("Şifre : ");
        this.pw = input.nextLine();
        if ((select == 1)) {
            if ((this.id.equals("onur")) && (this.pw.equals("128"))) {
                n = 1;
                isLogin = true;
            } else if ((this.id.equals("fuat")) && (this.pw.equals("150"))) {
                n = 2;
                isLogin = true;
            } else if ((this.id.equals("doğcan")) && (this.pw.equals("125"))) {
                n = 3;
                isLogin = true;
            } else {
                System.out.println("Hatalı Bir Giriş Yaptınız. Tekrar Deneyiniz.");
                login();
            }
        } else if ((this.select == 2)) {
            if ((this.id.equals("bahattin")) && (this.pw.equals("trh"))) {
                n = 1;
                isLogin = true;
            } else if ((this.id.equals("yunus")) && (this.pw.equals("fzk"))) {
                n = 2;
                isLogin = true;
            } else if ((this.id.equals("bayram")) && (this.pw.equals("mat"))) {
                n = 3;
                isLogin = true;
            } else {
                System.out.println("Hatalı Bir Giriş Yaptınız. Tekrar Deneyiniz.");
                login();
            }
        } else {
            System.out.println("Hatalı Bir Giriş Yaptınız. Tekrar Deneyiniz.");
            login();
        }


    }

    void ogrenci() {
        System.out.println("1-Not Sorgula\n2-Not Ortalaması Sorgula\n3-Belge Sorgula\n4-Sınıf Geçme Sorgula\n5-Oturumu Kapat");
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
        this.select = inp.nextInt();
        if (select != 1 && select != 2 && select != 3 && select != 4 && select != 5) {
            System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz.");
            ogrenci();
        }
        if (select == 5) {
            choice = false;
        }

    }

    void ogretmen() {
        System.out.println("1-Sınav Gir\n2-Sözlü Gir\n3-Öğrenci Sorgula\n4-Oturumu Kapat.");
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
        this.select = inp.nextInt();
        if (select != 1 && select != 2 && select != 3 && select != 4) {
            System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz.");
            ogrenci();
        }
        if (select == 4) {
            choice = false;
        } else if (select == 1 || select == 2) {
            System.out.println("İşlem Yapmak İstediğiniz Öğrencinin Numarasını Giriniz : ");
            search = input.nextLine();
            System.out.print("Not Giriniz : ");
            note = inp.nextInt();
            if (this.search.equals("128")) {
                s = 1;
                choice = true;
            } else if (this.search.equals("150")) {
                s = 2;
                choice = true;
            } else if (this.search.equals("125")) {
                s = 3;
                choice = true;
            }
        } else if (select == 3) {
            System.out.println("İşlem Yapmak İstediğiniz Öğrencinin Numarasını Giriniz : ");
            search = input.nextLine();
            if (this.search.equals("128")) {
                s = 1;
                choice = true;
            } else if (this.search.equals("150")) {
                s = 2;
                choice = true;
            } else if (this.search.equals("125")) {
                s = 3;
                choice = true;
            }
        } else {
            System.out.println("Hatalı Bir Giriş Yaptınız. Tekrar Deneyiniz.");
        }
    }


}
