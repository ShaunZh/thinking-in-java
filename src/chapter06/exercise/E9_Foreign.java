package chapter06.exercise;
import chapter06.example.*;

public class E9_Foreign {
    public static void main(String[] args) {
        // 因为E9_PackagedClass属于chapter06.example包，且其类型不是public，因此，在此处访问会报错
        // 如果将E9_Foreign类放到chapter06.example包中，那么它与E9_PackagedClass处于同一个包中，则可以访问
        E9_PackagedClass pc = new E9_PackagedClass();
    }
}
