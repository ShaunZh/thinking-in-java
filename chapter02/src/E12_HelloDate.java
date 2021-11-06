//: object/HelloDate.java
import java.util.*;

/** Thinking in java的第一个示例程序
 * 显示一个字符串和今天的日期
 * @author Bruce Eckel
 * @version 4.0
 * */
public class E12_HelloDate {
    /**
     * @param args array of string arguments
     *
     * */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
Hello, it's:
Sun Oct 31 22:18:49 CST 2021
*/
