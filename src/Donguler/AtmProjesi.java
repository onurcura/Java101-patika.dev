package Donguler;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 4, select, balance = 1000, price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = inp.nextLine();
            System.out.print("Şifreniz : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.print("Hatalı Giriş Yaptınız. Tekrar Deneyiniz.");
                    }
                } while (select != 4);
                System.out.print("Tekrar Görüşmek Üzere. İyi Günler.");
                break;


            } else {
                right--;
                if (right == 0) {
                    System.out.print("Hesabınız Bloke Olmuştur. Lütfen Banka ile İletişime Geçiniz.");
                } else {
                    System.out.print("Hatalı Bir Giriş Yaptınız. Tekrar Deneyiniz. Kalan Hakkınız : " + right);
                    System.out.println();
                }

            }
        }


    }
}
