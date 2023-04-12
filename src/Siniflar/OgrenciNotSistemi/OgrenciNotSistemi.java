package Siniflar.OgrenciNotSistemi;

public class OgrenciNotSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Bahattin","TRH","05111111111");
        Teacher t2 = new Teacher("Yunus","FZK","05000000000");
        Teacher t3 = new Teacher("Bayram","MAT","05222222222");
        Course tarih = new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik","101","FZK");
        Course mat = new Course("Matematik","101","MAT");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        mat.addTeacher(t3);

        Student s1 = new Student("Onur","128","12",tarih,fizik,mat);
        s1.addBulkExamNotes(50,60,70);
        fizik.printTeacher();
        s1.isPass();
    }
}
