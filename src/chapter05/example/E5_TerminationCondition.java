package chapter05.example;

class Book {
    boolean checkedout = false;
    Book(boolean check) {
        checkedout = check;
    }
    void checkIn() {
        checkedout = false;
    }

    // 在对象被销毁之前执行清理工作
    protected void finalize() {
        // 在Book对象被回收之前判断书是否被归还
        if (checkedout) {
            System.out.println("Error: checked out");
            // 或者 调用父类的finalize方法执行清除工作
            // super.finalize();
        }
    }
}
public class E5_TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        // 强制垃圾回收
        System.gc();
    }
}
