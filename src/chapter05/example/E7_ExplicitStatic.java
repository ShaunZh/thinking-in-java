package chapter05.example;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

/*
* 下面代码中无论是将(1)或(2)中的注释去掉，都会触发静态初始化
* */
public class E7_ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
//        Cups.cup1.f(99); // (1)
    }
     static Cups cup1 = new Cups(); // (2)
     static Cups cup2 = new Cups(); // (2)
}
