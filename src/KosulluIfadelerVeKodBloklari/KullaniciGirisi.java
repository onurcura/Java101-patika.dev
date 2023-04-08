package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımladık. Kullanıcıya giriş yaptırdık.
        String userName, password, password1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();
        //patika-java123 doğru kabul edip yanlış şifre girmesi halinda şifre değiştirme seçeneği koyduk.(Aynı olamaz.)
        if (userName.equals("patika")) {
            if (password.equals("java123")) {
                System.out.println("Giriş Yaptınız !");
            } else {
                System.out.print("Hatalı Bir Şifre Girdiniz. Şifrenizi Yenilemek İstiyorsanız Lütfen 1'e, Çıkış Yapmak İçin 0'a Basınız : ");
                int opt = inp.nextInt();
                if (opt == 1) {
                    System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                    inp.nextLine();
                    password1 = inp.nextLine();
                    if(password1.equals("java123")){
                        System.out.println("Şifre Oluşturulamadı. Lütfen Başka Şifre Giriniz.");
                        password1= inp.nextLine();
                        System.out.println(password1.equals("java123") ? "Şifre Oluşturulamadı." : "Şifre Oluşturuldu.");
                    }else{
                        System.out.print("Şifreniz Oluşturuldu.");
                    }

                }else{
                    System.out.println("İyi Günler.");
                }
            }


        }else{
            System.out.println("Kullanıcı Adı ve Şifre Hatalı!");
        }
    }
}
