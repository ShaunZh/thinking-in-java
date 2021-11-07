package chapter05.exercise;

class People{
    static {
        System.out.println("static print");
    }
    People(String name) {
        System.out.println(name);
    }
}

public class E17_ArrayUninitialization {
    public static void main(String[] args) {
        // (1)处只创建对象引用数组，但不初始化，可以发现People中的构造函数并未执行
        People[] people; // (1)

        // 只有(2)处初始化了对象引用数组，People中的构造函数才会执行
//        People[] people = { // (2)
//                new People("Bob"),
//                new People("Lily"),
//                new People("Jack")
//        };
    }
}
