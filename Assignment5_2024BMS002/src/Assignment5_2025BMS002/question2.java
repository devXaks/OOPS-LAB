package Assignment5_2025BMS002;
class Complex {
    private double real;
    private double imaginary;

    public void setData(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void display() {
        System.out.println("The Complex Number is : " + real + " + " + imaginary + "i");
    }

     Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imaginary = c1.imaginary + c2.imaginary;
        return result;
    }
}
public class question2 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.setData(32.32, 22.71);
        c2.setData(14.21, 1.34);

        System.out.println("First Complex Number:");
        c1.display();
        System.out.println("Second Complex Number:");
        c2.display();
        Complex ans = new Complex();
        ans = ans.add(c1, c2);
        System.out.println("Sum of the Complex Numbers:");
        ans.display();
    }
}
