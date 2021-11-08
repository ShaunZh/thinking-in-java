package chapter06.example;

class Sundae{
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class E2_IceCream {
    public static void main(String[] args) {
        // 因为SunDae构造函数是private访问权限，因此，无法在外部类中访问，也就无法使用new Sundae实例化对象
        // Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}
