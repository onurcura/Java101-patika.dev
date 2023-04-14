package Siniflar.BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if(isCheck()){
            int round=1;
            if (startChance()){
                while(this.f1.health>0 && this.f2.health>0){
                    System.out.println("===== "+round+ ". Round =====");
                    this.f2.health=this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    System.out.println("-------------------------------");
                    System.out.println(this.f1.name + " Sağlık : "+this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : "+this.f2.health);
                    System.out.println("-------------------------------");
                    round++;
                }

            }else{
                while(this.f1.health>0 && this.f2.health>0){
                    System.out.println("===== "+round+ ". Round =====");
                    this.f1.health=this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health=this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    System.out.println("-------------------------------");
                    System.out.println(this.f2.name + " Sağlık : "+this.f2.health);
                    System.out.println(this.f1.name + " Sağlık : "+this.f1.health);
                    System.out.println("-------------------------------");
                    round++;
                }

            }

        }else{
            System.out.println("Sporcuların Sikletleri Uymuyor !");
        }

    }
    boolean isCheck(){
        return ((this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight));
    }
    boolean isWin(){
        if(this.f2.health<=0){
            System.out.println("Maçı " + this.f1.name + " Kazandı !");
            return true;
        }
        if(this.f1.health<=0){
            System.out.println("Maçı " + this.f2.name + " Kazandı !");
            return true;
        }
        return false;
    }
    boolean startChance(){
        double startChance=50.0;
        double randomNumber = Math.random() * 100 ;
        return randomNumber <= startChance;
    }
}
