package chapter05.example;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Mugs {
    Mug mug1;
    Mug mug2;
    // 非静态实例初始化
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialization");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int " + i + ")");
    }
}
public class E7_InstanceInitialization {
    public static void main(String[] args) {
        new Mugs();
        new Mugs(1);
    }
}
