package chapter06.example;

public class E2_Cake {
    public static void main(String[] args) {
        // 虽然E2_Pie没有使用public修饰，但是由于E2_Cake和E2_Pie同属于一个包，所以默认具有访问当前包中其他类的权限，也就是默认包访问权限
        E2_Pie x = new E2_Pie();
        x.f();
    }
}
