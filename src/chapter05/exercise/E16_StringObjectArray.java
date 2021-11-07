package chapter05.exercise;

public class E16_StringObjectArray {
    public static void main(String[] args) {
        // 对象数组如果在未初始化之前使用，就会产生异常
        String[] strArr = {
                "name",
                "age",
                "address"
        };
        for (String s: strArr) {
            System.out.println(s);
        }

    }
}
