package access;
import chapter06.example.Cookie;

public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // 不能访问，因为chapter06.example.Cookie中的bite没有添加访问权限，
        // 默认的权限是只向包中的类提供访问权，所以，bite()成员在Dinner.java中无法访问，可以通过添加public使其具有public的访问权限
//        x.bite();
    }
}
