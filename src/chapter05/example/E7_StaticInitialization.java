package chapter05.example;

class Bowl {
    void print(String s) {
        System.out.println(s);
    }
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}

/*
static数据特性：
1. static数据只占用一份存储区域
2. static关键字不能应用于局部变量，也就是它只能作用于域(类的属性和方法)
3. 没有初始化的static数据初始值：
   3.1 基本类型：与基本类型相同的标准初值
   3.2 引用类型：初始值为null
4. 静态初始化只在必要时刻才会执行，必要时刻：
   4.1 static所在对象进行实例化
   4.2 访问static属性或方法
5. 已经初始化的static数据，不会再次初始化，也就是说再次实例化对象时，不会对static数据机进行初始化了

数据初始化的顺序，是按照数据定义的先后顺序执行的，顺序如下：
1. 静态对象
2. 非静态对象
3. 构造函数

* */
class Table {
    static Bowl bow1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class E7_StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
