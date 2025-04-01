package Assignment5_2025BMS002;

abstract class Marks{
    int markICP;
    int markDSA;
    double percentage;

    abstract double getPercentage();
}
class CSE extends Marks{
    int algoDesign;
    CSE(int marksICP, int markDSA, int algoDesign){
        this.markICP = marksICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }


    @Override
    double getPercentage() {
        percentage = (markICP + markDSA + algoDesign)/3.0;
        return percentage;
    }
}
class NonCSE extends Marks{
    int enggMechanics;
    NonCSE(int marksICP, int markDSA, int enggMechanics){
        this.markICP = marksICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }


    double getPercentage(){
        percentage = (markICP + markDSA + enggMechanics) / 3.0;
        return percentage;
    }

}

public class question6 {
    public static void main(String[] args) {
        CSE student1 = new CSE(85, 95, 96);
        NonCSE student2 = new NonCSE(60, 50,100);
        System.out.println("Percentage of student 1(CSE) is : ");
        System.out.println(student1.getPercentage());
        System.out.println("Percentage of student 2(NonCSE) is : ");
        System.out.println(student2.getPercentage());
    }

}
