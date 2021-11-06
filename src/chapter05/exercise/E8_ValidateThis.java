package chapter05.exercise;

public class E8_ValidateThis {
    void print(String st) {
        System.out.println(st);
    }
    void validate() {
        print("Not use this");
        this.print("using this");
    }
    public static void main(String[] args) {
        E8_ValidateThis vt = new E8_ValidateThis();
        vt.validate();
    }
}
