package Assignment5_2025BMS002;

import java.util.Scanner;

class Person{
    int age;
    String name;
    void setData(int age,String name){
        this.age = age;
        this.name = name;
    }

    void displayData(){
        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
    }

    void checkYonger(Person p1){
        if(p1.age < age){
            System.out.println(p1.name +" is younger");;
        }
        else{
            System.out.println(name +"is younger");
        }
    }
}
public class question1 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Rohan";
        p1.age = 20;
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the age :");
        int age = sc.nextInt();
        p2.setData(age,name);
        System.out.println("Displaying data of person 1");
        p1.displayData();
        System.out.println("Displaying data of person 2");
        p2.displayData();
        System.out.println("");
        p1.checkYonger(p2);
        sc.close();
    }
}
