package Siniflar.OgrenciNotSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNotes(int note1,int note2,int note3){
        if (note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if (note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note=note3;
        }
    }
    void addBulkOpinionNotes(int note1,int note2,int note3){
        if (note1>=0 && note1<=100){
            this.c1.note1=note1;
        }
        if (note2>=0 && note2<=100){
            this.c2.note1=note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note1=note3;
        }
    }
    void isPass(){
        this.avarage = ((this.c1.note+this.c2.note+this.c3.note)*0.8+(this.c1.note1+this.c2.note1+this.c3.note1)*0.2)/3.0;
        calcAvarage();
        if(this.avarage >=55){
            System.out.println("Sınıfı Geçtiniz !");
        }else{
            System.out.println("Sınıfta Kaldınız !");
        }
    }
    void calcAvarage(){
        this.avarage = ((this.c1.note+this.c2.note+this.c3.note)*0.8+(this.c1.note1+this.c2.note1+this.c3.note1)*0.2)/3.0;
        System.out.println("Ortalamanız : " + this.avarage);
    }
    void printNote(){
        System.out.println(this.c1.name+" : "+this.c1.note);
        System.out.println(this.c2.name+" : "+this.c2.note);
        System.out.println(this.c3.name+" : "+this.c3.note);
    }
    void certificate(){
        if (this.avarage<70.0){
            System.out.println("Belge Kazanamadınız.");
        }else if (this.avarage<85){
            System.out.println("Teşekkür Belgesi Kazandınız.");
        }else if (this.avarage<=100){
            System.out.println("Takdir Belgesi Kazandınız.");
        }
    }
}
