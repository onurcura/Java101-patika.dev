package Siniflar.OgrenciNotSistemi;

public class OgrenciNotSistemi {
    public static void main(String[] args) {
        int select ;
        Menu m = new Menu();

        Teacher t1 = new Teacher("Bahattin", "TRH", "05111111111");
        Teacher t2 = new Teacher("Yunus", "FZK", "05000000000");
        Teacher t3 = new Teacher("Bayram", "MAT", "05222222222");
        Teacher t = t1;
        //Course sınıfından 3 ders nesnesi ürettik.
        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "101", "FZK");
        Course mat = new Course("Matematik", "101", "MAT");
        //Student sınıfından 3 öğrenci nesnesi ürettik.
        Student s1 = new Student("Onur", "128", "12", tarih, fizik, mat);
        Student s2 = new Student("Fuat", "150", "12", tarih, fizik, mat);
        Student s3 = new Student("Doğcan", "125", "12", tarih, fizik, mat);
        Student s = s1;
        //Öğretmenleri derslere atadık.
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        mat.addTeacher(t3);
        //Öğrencilerin notlarını girdik.
        s1.addBulkExamNotes(60,70,85);
        s2.addBulkExamNotes(70,75,65);
        s3.addBulkExamNotes(85,90,92);
        s1.printNote();

        do {
            m.start();
            if (m.select == 4)
                break;
            m.login();
            if (m.n == 1) {
                t = t1;
                s = s1;
            } else if (m.n == 2) {
                t = t2;
                s = s2;
            } else if (m.n == 3) {
                t = t3;
                s = s3;
            }

            select = m.select;
            switch (select) {
                case 1:
                    m.choice=true;
                    while(m.choice){
                        m.ogrenci();
                        switch (m.select) {
                            case 1:
                                s.printNote();
                                System.out.println(s.name);
                                break;
                            case 2:
                                s.calcAvarage();
                                break;
                            case 3:
                                s.certificate();
                                break;
                            case 4:
                                s.isPass();
                                break;
                        }

                    }

                    break;
                case 2:
                    m.ogretmen();
                    break;
                case 3:
                    m.yetkili();
                    break;
            }


        } while (true);


    }
}
