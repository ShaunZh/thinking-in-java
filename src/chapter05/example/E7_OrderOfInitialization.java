package chapter05.example;

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

// 变量定义的顺序决定了初始化的顺序，先进行变量的初始化，然后构造函数调用
// 即使变量定义散布于方法定义之间，它们仍旧会在任何方法被调用之前初始化
class House{
    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(333);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}

public class E7_OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
/* Output
Window(1)
Window(2)
Window(3)
House()
Window(3)
f()
 */
