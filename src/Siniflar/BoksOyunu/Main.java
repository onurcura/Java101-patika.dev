package Siniflar.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali",10,120,92,50,25);
        Fighter f2 = new Fighter("Frazier",15,140,100,15,5);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }
}
