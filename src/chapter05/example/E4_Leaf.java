package chapter05.example;

public class E4_Leaf {
    int i = 0;
    // 在类中，对于方法和属性字段的调用都不需要使用this，编译器会自动添加
    E4_Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        E4_Leaf x = new E4_Leaf();
        x.increment().increment().increment().increment().print();
    }
}
