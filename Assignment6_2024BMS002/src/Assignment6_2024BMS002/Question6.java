package Assignment6_2024BMS002;

interface Animal {
    void bark();
}

class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}



public class Question6 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
}
