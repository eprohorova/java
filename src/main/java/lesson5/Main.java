package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.FIO = "Ivan Ivanov";
        employee2.FIO = "Taras Taracov";
        employee3.FIO = "Anatoliy Anatolevih";
        employee4.FIO = "Aleksander Alecsandrov";
        employee5.FIO = "Ivan Petrov";

        employee1.jobTitle = "Engineer";
        employee2.jobTitle = "Engineer";
        employee3.jobTitle = "Engineer";
        employee4.jobTitle = "Engineer";
        employee5.jobTitle = "Engineer";

        employee1.email = "ivivan@mailbox.com";
        employee2.email = "Taracov@mailbox.com";
        employee3.email = "Anatolevih@mailbox.com";
        employee4.email = "Alecsandrov@mailbox.com";
        employee5.email = "Petrov@mailbox.com";

        employee1.age = 30;
        employee2.age = 26;
        employee3.age = 41;
        employee4.age = 35;
        employee5.age = 45;

        employee1.telephone = 892312312;
        employee2.telephone = 892312313;
        employee3.telephone = 892312314;
        employee4.telephone = 892312315;
        employee5.telephone = 892312316;

        employee1.salary = 32000;
        employee2.salary = 35000;
        employee3.salary = 40000;
        employee4.salary = 42000;
        employee5.salary = 45000;

        employee1.info();
        employee2.info();
        employee3.info();
        employee4.info();
        employee5.info();

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].FIO);
        }

        employee1.setAge();
        employee2.setAge();
        employee3.setAge();
        employee4.setAge();
        employee5.setAge();




    }
}
