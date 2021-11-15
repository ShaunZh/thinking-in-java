package chapter07.exercise;

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class E4_BaseClassConstructor extends Drawing {
    // 在该类中没有定义构造函数，java编译器会自动添加构造函数，同时，会在导出类之前调用基类的构造函数
    public static void main(String[] args) {
        E4_BaseClassConstructor bc = new E4_BaseClassConstructor();
    }

}
