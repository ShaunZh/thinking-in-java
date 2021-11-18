package chapter07.exercise;
import static hexon.util.Print.*;


class A {
    A(int i){
        print("A Constructor:" + i);
    }
}

class B {
    B(int i) {
        print("B Constructor:" + i);
    }
}

public class E7_ConstructorInit extends A {
   private static B b;
   E7_ConstructorInit() {
       super(1);
   }
   public static void main(String[] args) {
       E7_ConstructorInit ci = new E7_ConstructorInit();
       b = new B(10);
   }
}
