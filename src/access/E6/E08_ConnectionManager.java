package access.E6;

public class E08_ConnectionManager {
    private static E08_Connection[] pool = new E08_Connection[10];
    private static int count = 0;
    static {
        for (int i = 0; i < pool.length; i++) {
            pool[i] = new E08_Connection();
        }
        System.out.println("E08_ConnectionManage static");
    }
    public static E08_Connection getConnection() {
        if (count < pool.length) {
            return pool[count++];
        }
        return null;
    }
}
