package Assignment4_2024BMS002;

class Rectangle {
int length;
int width;

Rectangle(){
    //non parameterised constructor;
    length = 10;
    width = 10;
    System.out.println("Rectangle 1 : Length: " + length + " Width: " + width);

}
Rectangle(int a){
    //constructor with one parameter;
    length = a;
    width = 10;
    System.out.println("Rectangle 2 : Length: " + length + " Width: " + width);
}
Rectangle(int a, int b){
    //constructor with two parameter;
    length = a;
    width = b;
    System.out.println("Rectangle 3 : Length: " + length + " Width: " + width);
}

}



public class Question3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20);
        Rectangle r3 = new Rectangle(10,20);
    }
}
