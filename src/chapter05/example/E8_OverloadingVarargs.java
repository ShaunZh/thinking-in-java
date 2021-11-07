package chapter05.example;

public class E8_OverloadingVarargs {
    static void f(Character... args) {
        System.out.println("first");
        for (Character c : args) {
            System.out.println(" " + c);
        }
        System.out.println();
    }
    static void f(Integer... args) {
        System.out.println("second");
        for (Integer i : args) {
            System.out.println(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("third");
        for (Long l : args) {
            System.out.println(" " + l);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        // f(); // 编译失败 - ambiguous(模棱两可的): 编译器不知道使用哪个f的重载函数
    }
}
