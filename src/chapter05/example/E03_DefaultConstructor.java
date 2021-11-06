package chapter05.example;

// 没有自定义构造器，Java编译器会自动生成一个构造器，所以执行 new Bird()时不会报错
class Bird {}

// Bird2自定了构造器，因此，Java编译器不会再创建构造器
class Bird2 {
    Bird2(int i) {}
    Bird2(double f) {}
}

public class E03_DefaultConstructor {
    public static void main(String[] args) {
        Bird b = new Bird();
        Bird2 b2 = new Bird2(1);
        // 下面代码如果不添加参数，编译器会报错，因为它不知道使用Bird2中的哪个构造器来生成对象，
        // Bird2中的两个构造器都有参数
         Bird2 b2_1 = new Bird2();
    }
}


