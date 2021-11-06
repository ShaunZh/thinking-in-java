
class StaticTest {
    static int i = 100;
}

public class E07_Incrementable {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        E07_Incrementable inc = new E07_Incrementable();
        inc.increment();
        System.out.println(StaticTest.i);
    }
}
