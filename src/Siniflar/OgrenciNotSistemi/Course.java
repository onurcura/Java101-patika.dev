package Siniflar.OgrenciNotSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int note1;


    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.note1=0;
    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
        }else{
            System.out.println(teacher + " Bu Dersi Veremez.");
        }

    }
    void printTeacher(){
        System.out.println("ADI SOYADI : "+this.teacher.name+"\nBRANŞI : "+this.teacher.branch+"\nNO : "+this.teacher.mpno);
    }

}
