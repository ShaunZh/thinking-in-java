package chapter05.exercise;

public class E03_DefaultConstructor {
    E03_DefaultConstructor() {
        System.out.println("Default Constructor");
    }

    E03_DefaultConstructor(String str) {
        System.out.println("Constructor Overloading " + str);
    }

    public static void main(String[] args) {
        E03_DefaultConstructor ds = new E03_DefaultConstructor();
        E03_DefaultConstructor dsc = new E03_DefaultConstructor("hello");
    }
}
