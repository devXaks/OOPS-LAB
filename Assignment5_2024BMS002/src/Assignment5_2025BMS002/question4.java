package Assignment5_2025BMS002;

class Deposit {
    long Principal;
    int Time;
    double Rate;
    double TotalAmt;

    Deposit() {
        this.Principal = 0;
        this.Time = 0;
        this.Rate = 0.0;
        this.TotalAmt = 0.0;
    }

    Deposit(long Principal, int Time, double Rate) {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = Rate;
        this.TotalAmt = 0.0;
    }

    Deposit(long Principal, int Time) {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = 0.0;
        this.TotalAmt = 0.0;
    }

    Deposit(long Principal, double Rate) {
        this.Principal = Principal;
        this.Time = 0;
        this.Rate = Rate;
        this.TotalAmt = 0.0;
    }

    void calcAmt() {
        this.TotalAmt = Principal + (Principal * Rate * Time) / 100;
    }

    void display() {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time);
        System.out.println("Rate: " + Rate);
        System.out.println("Total Amount: " + TotalAmt);
    }
}

public class question4 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Deposit deposit1 = new Deposit(12000, 4, 7.51);
        deposit1.calcAmt();
        deposit1.display();

        Deposit deposit2 = new Deposit(201000, 3);
        deposit2.calcAmt();
        deposit2.display();

        Deposit deposit3 = new Deposit(15000, 8.2);
        deposit3.calcAmt();
        deposit3.display();
    }
}

