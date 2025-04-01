package Assignment6_2024BMS002;

class Sports {
    void play() {
        System.out.println("Playing Undefined Sports");
    }
}
class Football extends Sports {
    @Override
    void play() {
        System.out.println("Playing Football!");
    }
}
class Basketball extends Sports {
    @Override
    void play() {
        System.out.println("Playing Basketball!");
    }
}
class Rugby extends Sports {
    @Override
    void play() {
        System.out.println("Playing Rugby!");
    }
}
public class Question5 {
        public static void main(String[] args) {
            Sports football = new Football();
            Sports basketball = new Basketball();
            Sports rugby = new Rugby();
            football.play();
            basketball.play();
            rugby.play();
    }
}
