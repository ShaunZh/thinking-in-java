package chapter05.exercise;

public class E01_InitNull {
    String st; // 未初始化的String引用会被Java初始化为null
    public static void main(String[] args) {
        E01_InitNull In = new E01_InitNull();
        System.out.println(In.st);
    }
}
