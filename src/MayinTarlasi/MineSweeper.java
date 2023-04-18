package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scan = new Scanner(System.in);
    int x;
    int y;
    int move = 0;
    String[][] mineSw;
    String[][] mineSw1;
    int numMines;

    MineSweeper() {

    }

    void run() {
        System.out.println("1-Yeni Oyun\n2-Çıkış Yap");
        System.out.print("Hoşgeldiniz . Lütfen yapmak istediğiniz işlemi seçiniz : ");
        int select = scan.nextInt();
        if (select == 1) {
            System.out.println("Oynamak istediğiniz boyutları giriniz.(Örn 4 4 )");
            this.x = scan.nextInt();
            this.y = scan.nextInt();
            String[][] mineSw = new String[x][y];
            String[][] mineSw1 = new String[x][y];
            for (int k = 0; k < x; k++) {
                for (int l = 0; l < y; l++) {
                    mineSw[k][l] = "-";
                    mineSw1[k][l] = "-";
                }
            }
            this.mineSw1 = mineSw1;
            this.mineSw = mineSw;
            generateMines();
            this.move = 0;
            move();

        } else {
            System.out.println("İyi Günler !");
        }
    }

    void move() {
        print();
        if (this.move == (this.x * this.y) - this.numMines) {
            System.out.println("Tebrikler. Kazandınız !");
            run();
        } else {
            System.out.println("Lütfen hamlenizi yapınız. (Örn 0 1)");
            int i = scan.nextInt();
            int j = scan.nextInt();
            if ((i >= 0 && i < this.mineSw.length) && (j >= 0 && j < this.mineSw[0].length)) {
                if (!mineSw[i][j].equals("*")) {
                    int counter = 0;
                    for (int k = i - 1; k <= i + 1; k++) {
                        if (k < 0) {
                            k = i;
                        } else if (k > mineSw.length - 1) {
                            break;
                        }
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (l < 0) {
                                l = j;
                            }
                            if (l > mineSw[0].length - 1) {
                                break;
                            }
                            if (mineSw[k][l].equals("*")) {
                                counter++;
                            }
                        }
                    }
                    mineSw1[i][j] = String.valueOf(counter);
                    this.move++;
                    move();
                } else {
                    System.out.println("Kaybettiniz !");
                    run();
                }
            } else {
                System.out.println("Hatalı bir değer girdiniz. Tekrar deneyiniz.");
                move();
            }
        }

    }

    void print() {
        for (String[] i : this.mineSw1) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void generateMines() {
        this.numMines = (this.x * this.y) / 4;
        for (int i = 1; i <= this.numMines; i++) {
            Random rand = new Random();
            int k = rand.nextInt(this.mineSw.length);
            int l = rand.nextInt(this.mineSw[0].length);
            this.mineSw[k][l] = "*";

        }

    }
}
