package Siniflar.OgrenciNotSistemi;

public class OgrenciNotSistemi {
    public static void main(String[] args) {
        int select;
        Menu m = new Menu();
        Teacher t1 = new Teacher("Bahattin", "TRH", "05111111111");
        Teacher t2 = new Teacher("Yunus", "FZK", "05000000000");
        Teacher t3 = new Teacher("Bayram", "MAT", "05222222222");
        Teacher t = t1;
        //Course sınıfından 3 ders nesnesi ürettik.
        Course tarih= new Course("Tarih", "101", "TRH");
        Course tarih1= new Course("Tarih", "102", "TRH");
        Course tarih2= new Course("Tarih", "103", "TRH");
        Course fizik = new Course("Fizik", "101", "FZK");
        Course fizik1 = new Course("Fizik", "102", "FZK");
        Course fizik2 = new Course("Fizik", "103", "FZK");
        Course mat = new Course("Matematik", "101", "MAT");
        Course mat1 = new Course("Matematik", "102", "MAT");
        Course mat2 = new Course("Matematik", "103", "MAT");
        //Student sınıfından 3 öğrenci nesnesi ürettik.
        Student s1 = new Student("Onur", "128", "10", tarih, fizik, mat);
        Student s2 = new Student("Fuat", "150", "11", tarih1, fizik1, mat1);
        Student s3 = new Student("Doğcan", "125", "12", tarih2, fizik2, mat2);
        Student s = s1;
        //Öğretmenleri derslere atadık.
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        mat.addTeacher(t3);
        //Öğrencilerin notlarını girdik.
        s1.addBulkExamNotes(60, 70, 85);
        s2.addBulkExamNotes(70, 90, 65);
        s3.addBulkExamNotes(85, 90, 92);
        s1.addBulkOpinionNotes(85,85,85);
        s2.addBulkOpinionNotes(90,90,90);
        s3.addBulkOpinionNotes(90,95,90);


        do {
            m.start();
            if (m.select == 3)
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
                    m.choice = true;
                    while (m.choice) {
                        m.ogrenci();
                        switch (m.select) {
                            case 1:
                                s.printNote();
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
                   if(m.n==1){
                       m.choice=true;
                       while (m.choice){
                           m.ogretmen();
                           switch (m.select){
                               case 1 :
                                   if (m.s == 1) {
                                       s1.c1.note=m.note;
                                   } else if (m.s==2) {
                                       s2.c1.note=m.note;
                                   }else if (m.s==3){
                                       s3.c1.note=m.note;
                                   }
                                   break;
                               case 2 :
                                   if (m.s == 1) {
                                       s1.c1.note1=m.note;
                                   } else if (m.s==2) {
                                       s2.c1.note1=m.note;
                                   }else if (m.s==3){
                                       s3.c1.note1=m.note;
                                   }
                                   break;
                               case 3 :
                                   if (m.s==1){
                                       System.out.println(s1.name);
                                       s1.printNote();
                                       s1.calcAvarage();
                                       s1.certificate();
                                       s1.isPass();
                                   }else if (m.s==2){
                                       System.out.println(s2.name);
                                       s2.printNote();
                                       s2.calcAvarage();
                                       s2.certificate();
                                       s2.isPass();
                                   }else if (m.s==3){
                                       System.out.println(s3.name);
                                       s3.printNote();
                                       s3.calcAvarage();
                                       s3.certificate();
                                       s3.isPass();
                                   }

                           }
                       }

                   }else if(m.n==2){
                       m.choice=true;
                       while (m.choice){
                           m.ogretmen();
                           switch (m.select){
                               case 1 :
                                   if (m.s == 1) {
                                       s1.c2.note=m.note;
                                   } else if (m.s==2) {
                                       s2.c2.note=m.note;
                                   }else if (m.s==3){
                                       s3.c2.note=m.note;
                                   }
                                   break;
                               case 2 :
                                   if (m.s == 1) {
                                       s1.c2.note1=m.note;
                                   } else if (m.s==2) {
                                       s2.c2.note1=m.note;
                                   }else if (m.s==3){
                                       s3.c2.note1=m.note;
                                   }
                                   break;
                               case 3 :
                                   if (m.s==1){
                                       System.out.println(s1.name);
                                       s1.printNote();
                                       s1.calcAvarage();
                                       s1.certificate();
                                       s1.isPass();
                                   }else if (m.s==2){
                                       System.out.println(s2.name);
                                       s2.printNote();
                                       s2.calcAvarage();
                                       s2.certificate();
                                       s2.isPass();
                                   }else if (m.s==3){
                                       System.out.println(s3.name);
                                       s3.printNote();
                                       s3.calcAvarage();
                                       s3.certificate();
                                       s3.isPass();
                                   }

                           }
                       }

                   }else if (m.n==3){
                       m.choice=true;
                       while (m.choice){
                           m.ogretmen();
                           switch (m.select){
                               case 1 :
                                   if (m.s == 1) {
                                       s1.c3.note=m.note;
                                   } else if (m.s==2) {
                                       s2.c3.note=m.note;
                                   }else if (m.s==3){
                                       s3.c3.note=m.note;
                                   }
                                   break;
                               case 2 :
                                   if (m.s == 1) {
                                       s1.c3.note1=m.note;
                                   } else if (m.s==2) {
                                       s2.c3.note1=m.note;
                                   }else if (m.s==3){
                                       s3.c3.note1=m.note;
                                   }
                                   break;
                               case 3 :
                                   if (m.s==1){
                                       System.out.println(s1.name);
                                       s1.printNote();
                                       s1.calcAvarage();
                                       s1.certificate();
                                       s1.isPass();
                                   }else if (m.s==2){
                                       System.out.println(s2.name);
                                       s2.printNote();
                                       s2.calcAvarage();
                                       s2.certificate();
                                       s2.isPass();
                                   }else if (m.s==3){
                                       System.out.println(s3.name);
                                       s3.printNote();
                                       s3.calcAvarage();
                                       s3.certificate();
                                       s3.isPass();
                                   }

                           }
                       }
                   }
                    break;
            }

        } while (true);


    }
}
