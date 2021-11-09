package chapter06.exercise;

class E4_Cookie {
    public E4_Cookie() {
        System.out.printf("Cookie constructor");
    }
    protected void bit() {
        System.out.printf("bite");
    }
}

public class E4_ProtectedTest extends E4_Cookie{
    public E4_ProtectedTest() {
        System.out.printf("E4_ProtectedTest");
    }
    public void chomp() {
        bit();
    }

    public static void main(String[] args) {
        E4_ProtectedTest x = new E4_ProtectedTest();
        x.chomp();
    }

}
