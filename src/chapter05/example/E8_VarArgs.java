package chapter05.example;

class A{}
public class E8_VarArgs {
    static void printArray(Object... args) {
        for(Object obj: args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(1), new Float(3.14), new Double(11.111));
        printArray(37, 3.1415926F, 3333.333);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        // (Object[])类型转换并无必要
        printArray((Object[])new Integer[]{1, 2, 3, 4, 5,6});
        printArray();
    }
}
