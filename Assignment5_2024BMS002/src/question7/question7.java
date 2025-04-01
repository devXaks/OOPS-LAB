package question7;
interface DetailInfo {
    void display();
    int count();
}

class Person implements DetailInfo {
    String name;
    static int maxcount = 0;
     Person(String name) {
        this.name = name;
        int length = count();
        if (length > maxcount) {
            maxcount = length;
        }
    }
    public void display() {
        System.out.println("Person's Name: " + name);
    }
    public int count() {
        return name.length();
    }
    public static void displayMax() {
        System.out.println("Maximum name length encountered: " + maxcount);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Akshat");
        Person p2 = new Person("Shivansh");
        Person p3 = new Person("Ritik");
        p1.display();
        System.out.println("Character Count: " + p1.count());
        p2.display();
        System.out.println("Character Count: " + p2.count());
        p3.display();
        System.out.println("Character Count: " + p3.count());
        displayMax();
    }
}
