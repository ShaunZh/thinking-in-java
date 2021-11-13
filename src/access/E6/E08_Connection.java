package access.E6;

public class E08_Connection {
    private static int count = 0;
    private int id = count++; // id不是static类型，因为如果是改成static类型，那么其只会初始化一次，也就是说其值一直是0
    E08_Connection(){}
    public void doString(){}
    public String toString() {
        return "E09_Connection " + id;
    }
}
