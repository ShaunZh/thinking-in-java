package chapter05.example;

import java.util.concurrent.Flow;

public class E4_Flower {
    int petalCount = 0;
    String s = "initial value";

    void print(String st) {
        System.out.println(st);
    }

    E4_Flower() {
        this("hi", 45);
        print("default constructor (no args)");
    }

    E4_Flower(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    E4_Flower(String str) {
        print("Constructor w/ String arg only, s = " + str);
        s = str;
    }

    E4_Flower(String str, int petals) {
        // 使用this调用构造函数E4_Flower
        this(petals);
        // 下面代码有错误，this()这种调用在构造函数中只能是作为第一个语句
        // this(str);
        s = str;
        print("String & int args");
    }

    void printPetalCount() {
        // this(11);  该句有错误，这种信息只能在构造函数中调用
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        E4_Flower x = new E4_Flower();
        x.printPetalCount();
    }
}
