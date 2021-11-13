package chapter06.exercise;
import access.E6.*;

public class E8_ConnectionManager {
    public static void main(String[] args) {
        E08_Connection c = E08_ConnectionManager.getConnection();
        while(c != null) {
            System.out.println(c);
            c.doString();
            c = E08_ConnectionManager.getConnection();
        }
    }
}
