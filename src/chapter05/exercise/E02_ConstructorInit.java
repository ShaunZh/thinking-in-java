package chapter05.exercise;

public class E02_ConstructorInit {
    String st = "init";
    String constructorInit;

    E02_ConstructorInit() {
        constructorInit = "constructor init";
        System.out.println("constructor init finish");
    }
    public static void main(String[] args) {
        E02_ConstructorInit ci = new E02_ConstructorInit();
        System.out.println("Define Init： " + ci.st);
        System.out.println("Constructor Init： " + ci.constructorInit);
    }

}
