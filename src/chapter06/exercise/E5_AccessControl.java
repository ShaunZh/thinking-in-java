package chapter06.exercise;

class E5_Person {

    public String name = "Bob";
    protected String address = "China";
    private int age = 20;
    String job = "Web";
}

public class E5_AccessControl {
    public static void main(String[] args) {
        E5_AccessControl ac = new E5_AccessControl();
    }
    public E5_AccessControl() {
        E5_Person p = new E5_Person();
        System.out.printf("package access: ", p.job);
        System.out.printf("public access:  ", p.name);
        System.out.printf("protected access:  ", p.address); // protected具有包访问权限，因此可以访问
        // System.out.printf("private access:  ", p.age); // age是private，只能在类内部访问
    }
}
