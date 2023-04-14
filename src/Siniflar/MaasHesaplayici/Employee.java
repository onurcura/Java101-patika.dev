package Siniflar.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    int standartWorkHours =40;
    int year=2023;
    double raiseSalary;
    Employee(String name , double salary,int workHours,int hireYear){
        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if (this.salary>=1000){
            return this.tax=this.salary*0.03;
        }else{
            return 0.0;
        }
    }
    int bonus(){
        if (this.workHours > this.standartWorkHours){
            return this.bonus = (this.workHours-this.standartWorkHours)*30;
        }else{
            return 0;
        }
    }
    double raiseSalary(){
        if ((this.year-this.hireYear)<10){
            return this.raiseSalary = this.salary*0.05;
        }else if ((this.year-this.hireYear)<20){
            return this.raiseSalary = this.salary*0.1;
        }else {
            return this.raiseSalary = this.salary*0.15;
        }
    }
    public String toString(){
        return ""
                + "\nFullname: " + this.name
                + "\nSalary: " + this.salary
                + "\nWork hours: " + this.workHours
                + "\nHiring year: " + this.hireYear
                + "\nTax: " + tax()
                + "\nBonus: " + bonus()
                + "\nRaise salary: " + raiseSalary()
                + "\nSalary with Taxes and Bonuses: " + (this.salary - tax() + bonus())
                + "\nTotal salary: " + (this.salary + raiseSalary());
    }
}
