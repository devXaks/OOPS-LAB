package Assignment6_2024BMS002;
class Vehicle{
    void speedUp(int speed){
        speed +=10;
    }
}
class Car extends Vehicle{
    @Override
    void speedUp(int speed) {
        speed+=20;
        System.out.println("The current speed is "+speed);
    }

}
class Bicycle extends Vehicle{
    void speedUp(int speed){
        speed+=5;
        System.out.println("The current speed is "+speed);

    }
}
public class Question4 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.speedUp(10);
        bicycle.speedUp(10);
    }
}
