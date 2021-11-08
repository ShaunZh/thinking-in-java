package chapter06.example;
import static hexon.util.Print.*;

public class Cookie {
    public Cookie() {
        print("Cookie constructor");
    }
    // bite没有权限修饰词，因此该方法是包访问权限：指当前包中的所有其他类对这个成员都有访问权限，但是，对于该包之外的所有类，这个成员是private
    void bite() {
        print("Systme.out.println(bit)");
    }
}
