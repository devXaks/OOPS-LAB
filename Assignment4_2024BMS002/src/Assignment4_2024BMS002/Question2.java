package Assignment4_2024BMS002;

class Employee{
    String empName;
    int salary;

    Employee(String empName, int salary){
        this.empName = empName;
        this.salary = salary;
        System.out.println("Initialised employee");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Question2 {
    //programmed by 2024BMS002;
    public static void main(String[] args) {
        Employee e1 = new Employee("James", 20000);
    }
}
