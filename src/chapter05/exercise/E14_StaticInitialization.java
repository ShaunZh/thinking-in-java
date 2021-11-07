package chapter05.exercise;

class Person {
    static String name = "Bob";
    static String country; // (1)
    static {
    //  如果将(1)和(2)注释，将(3)放开，在(3)处定义和初始化，会导致无法在该static作用域外访问到country
    //  String country = "China"; (3)
        country = "China"; // (2)
    }
    static void print() {
        System.out.println("name: " + name + "; country: " + country);
    }
}

public class E14_StaticInitialization {
    public static void main(String[] args) {
        Person p = new Person();
        p.print();
    }
}
