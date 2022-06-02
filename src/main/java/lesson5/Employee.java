package lesson5;

public class Employee {
    String FIO;
    String jobTitle;
    String email;
    int age;
    int telephone;
    int salary;


    public void setAge (){
        if (age >= 40) {
            this.age = age;
            System.out.println(" ФИО " + FIO + " Должность " + jobTitle + " Емэйл " + email + " Возраст " + age);
        }
    }

    public void info (){
        System.out.println(" ФИО " + FIO + " Должность " + jobTitle + " Емэйл " + email + " Возраст " + age + " Телефон " + telephone + " Зарплата " + salary);
    }

}
