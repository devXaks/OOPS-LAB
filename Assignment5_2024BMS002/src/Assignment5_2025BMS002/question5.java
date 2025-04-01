package Assignment5_2025BMS002;

class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person1 {
    int Eid;
    double salary;

    public Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    public void empDisplay() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}


public class question5 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Employee emp = new Employee("Akshat", 18, 001, 50000.0);
        emp.empDisplay();
    }
}
